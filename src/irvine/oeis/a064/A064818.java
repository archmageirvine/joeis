package irvine.oeis.a064;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerComposition;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A064818 Exotic numbers: write n in base 10 as d_1 d_2 ... d_k; sequence gives numbers n which can be obtained by using the digits d_1 ... d_k exactly once, at most one each of the symbols +, -, x, "divided by", sqrt, factorial, ^, together with any number of parentheses.
 * @author Sean A. Irvine
 */
public class A064818 extends Sequence1 implements Conjectural {

  // Because of solutions like 324 = (3*sqrt(2))^4 it is not sufficient to do this in rationals
  // However, the floating-point approximation here necessarily has limited precision

  private static final int FACTORIAL = 0;
  private static final int SQRT = 1;
  private static final int ADD = 2;
  private static final int SUBTRACT = 3;
  private static final int MULTIPLY = 4;
  private static final int DIVIDE = 5;
  private static final int POW = 6;
  private static final int EXCHANGE = 7;
  private static final double HEURISTIC_PRECISION = 1e-8; // making this higher does not make it better!

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private int[] toDigits(final int n) {
    final String s = String.valueOf(n);
    final int[] d = new int[s.length()];
    for (int k = 0; k < d.length; ++k) {
      d[k] = s.charAt(k) - '0';
    }
    return d;
  }

  private boolean isInteger(final double x) {
    return Math.abs(x - Math.round(x)) < HEURISTIC_PRECISION;
  }

  private boolean is(final double[] stack, final int sp, final int usedOps, final ArrayList<String> proof) {
//    if (mN == 324) {
//      System.out.println("SAI: " + mN + " " + proof + " " + Arrays.toString(stack));
//    }
    if (sp == 0) {
      // Check if we found a solution:
      //  - value must match
      //  - we must have used at least one operation
      if (usedOps != 0 && isInteger(stack[0])) {
        if (Math.round(stack[0]) == mN) {
          if (mVerbose) {
            StringUtils.message(mN + " = " + proof);
          }
          return true;
        }
      }
    }
    // Try the various possible operations
    for (int k = 0, bit = 1; k <= EXCHANGE; ++k, bit <<= 1) {
      if ((usedOps & bit) == 0) {
        final double a = stack[sp];
        if (k > SQRT && sp == 0) {
          break; // Binary operation requires stack of at least 2 items
        }
        switch (k) {
          case FACTORIAL:
            if (a >= 0 && a < 100 && isInteger(a)) {
              if (usedOps != 0 && a == 1) {
                break; // 1! pointless if already have done something
              }
              stack[sp] = Functions.FACTORIAL.z((long) a).doubleValue();
              proof.add("!");
              if (is(stack, sp, usedOps | bit, proof)) {
                return true;
              }
              proof.remove(proof.size() - 1);
              stack[sp] = a;
            }
            break;
          case SQRT:
            if (a > 1) {
              stack[sp] = Math.sqrt(a);
              proof.add("sqrt");
              if (is(stack, sp, usedOps | bit, proof)) {
                return true;
              }
              proof.remove(proof.size() - 1);
              stack[sp] = a;
            }
            break;
          case ADD:
            double b = stack[sp - 1];
            stack[sp - 1] = a + b;
            proof.add("+");
            if (is(stack, sp - 1, usedOps | bit, proof)) {
              return true;
            }
            proof.remove(proof.size() - 1);
            stack[sp - 1] = b;
            break;
          case SUBTRACT:
            b = stack[sp - 1];
            stack[sp - 1] = a - b;
            proof.add("-");
            if (is(stack, sp - 1, usedOps | bit, proof)) {
              return true;
            }
            proof.remove(proof.size() - 1);
            stack[sp - 1] = b;
            break;
          case MULTIPLY:
            b = stack[sp - 1];
            stack[sp - 1] = a * b;
            proof.add("*");
            if (is(stack, sp - 1, usedOps | bit, proof)) {
              return true;
            }
            proof.remove(proof.size() - 1);
            stack[sp - 1] = b;
            break;
          case DIVIDE:
            b = stack[sp - 1];
            if (b != 0) {
              stack[sp - 1] = a / b;
              proof.add("/");
              if (is(stack, sp - 1, usedOps | bit, proof)) {
                return true;
              }
              proof.remove(proof.size() - 1);
              stack[sp - 1] = b;
            }
            break;
          case POW:
            b = stack[sp - 1];
            final double pow = Math.pow(a, b);
            if (Double.isFinite(pow)) {
              stack[sp - 1] = pow;
              proof.add("^");
              if (is(stack, sp - 1, usedOps | bit, proof)) {
                return true;
              }
              proof.remove(proof.size() - 1);
              stack[sp - 1] = b;
            }
            break;
          case EXCHANGE:
            if (!"exch".equals(proof.get(proof.size() - 1))) {
              stack[sp] = stack[sp - 1];
              stack[sp - 1] = a;
              proof.add("exch");
              if (is(stack, sp, usedOps, proof)) {
                return true;
              }
              proof.remove(proof.size() - 1);
              stack[sp - 1] = stack[sp];
              stack[sp] = a;
            }
            break;
          default:
            throw new RuntimeException();
        }
      }
    }
    return false;
  }

  private boolean is(final int[] digits) {
    // Deal with all possible concatenations of the digits.
    for (int parts = 1; parts <= digits.length; ++parts) {
      final IntegerComposition comp = new IntegerComposition(digits.length, parts);
      int[] c;
      while ((c = comp.next()) != null) {
        final ArrayList<String> proof = new ArrayList<>();
        final double[] concat = new double[parts];
        for (int k = 0, j = 0; k < c.length; ++k) {
          int v = 0;
          for (int i = 0; i < c[k]; ++i) {
            v *= 10;
            v += digits[j++];
          }
          concat[k] = v;
          proof.add(String.valueOf(v));
        }
        if (is(concat, concat.length - 1, 0, proof)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose) {
        StringUtils.message("Starting search for " + mN);
      }
      final int[] digits = toDigits(mN);
      final Permutation perm = new Permutation(digits);
      int[] p;
      while ((p = perm.next()) != null) {
        if (is(p)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
