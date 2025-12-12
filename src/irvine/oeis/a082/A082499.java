package irvine.oeis.a082;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082499 Take a string of n x's and insert n-1 ^'s and n-2 pairs of parentheses in all possible legal ways. Sequence gives number of distinct values when x = sqrt(2).
 * @author Sean A. Irvine
 */
public class A082499 extends Sequence1 {

  private static final int ACCURACY = -32;

  private interface Expr {
  }

  private static final class Zero implements Expr {
  }

  private static final class One implements Expr {
  }

  private static final class X implements Expr {
  }

  private static final class Pow implements Expr {
    private final Expr mBase;
    private final Expr mExponent;

    private Pow(final Expr b, final Expr e) {
      mBase = b;
      mExponent = e;
    }
  }

  private static final class Mul implements Expr {
    private final Expr mA;
    private final Expr mB;

    private Mul(final Expr a, final Expr b) {
      mA = a;
      mB = b;
    }
  }

  private static final class Add implements Expr {
    private final Expr mA;
    private final Expr mB;

    private Add(final Expr a, final Expr b) {
      mA = a;
      mB = b;
    }
  }

  private static final class Log implements Expr {
    private final Expr mArg;

    private Log(final Expr a) {
      mArg = a;
    }
  }

  private static final Zero ZERO = new Zero();
  private static final One ONE = new One();
  private static final X XX = new X();

  private static Expr log(final Expr e) {
    // log(one) -> 0
    if (e instanceof One) {
      return ZERO;
    }
    // log(x) -> one
    if (e instanceof X) {
      return ONE;
    }
    // log(a*b) -> log(a) + log(b)
    if (e instanceof Mul) {
      final Mul m = (Mul) e;
      final Expr left = log(m.mA);
      final Expr right = log(m.mB);
      if (left instanceof Zero) {
        return right;
      }
      if (right instanceof Zero) {
        return left;
      }
      return new Add(left, right);
    }
    // log(a^b) -> b * log(a)
    if (e instanceof Pow) {
      final Expr exp = ((Pow) e).mExponent;
      final Expr logA = log(((Pow) e).mBase);
      if (exp instanceof Zero) {
        return ZERO; // 0 * log(a)
      }
      if (exp instanceof One) {
        return logA; // 1 * log(a)
      }
      return new Mul(logA, exp);
    }
    return new Log(e);
  }

  private final List<List<Expr>> mExprs = new ArrayList<>();
  {
    mExprs.add(null); // 0 not used
  }
  private int mN = 0;
  private final CR mX;

  protected A082499(final CR x) {
    mX = x;
  }

  /** Construct the sequence. */
  public A082499() {
    this(CR.SQRT2);
  }

  private CR eval(final Expr e) {
    if (e instanceof Zero) {
      return CR.ZERO;
    }
    if (e instanceof One) {
      return CR.ONE;
    }
    if (e instanceof X) {
      return mX;
    }
    if (e instanceof Pow) {
      final Pow p = (Pow) e;
      return eval(p.mBase).pow(eval(p.mExponent));
    }
    if (e instanceof Mul) {
      final Mul m = (Mul) e;
      return eval(m.mA).multiply(eval(m.mB));
    }
    if (e instanceof Add) {
      final Add m = (Add) e;
      return eval(m.mA).add(eval(m.mB));
    }
    if (e instanceof Log) {
      return eval(((Log) e).mArg).log();
    }
    throw new RuntimeException("Unknown expr");
  }

  protected TreeSet<CR> step() {
    if (++mN == 1) {
      mExprs.add(Collections.singletonList(XX));
    } else {
      final List<Expr> t = new ArrayList<>();
      for (int k = 1; k < mN; k++) {
        for (final Expr ch1 : mExprs.get(k)) {
          for (final Expr ch2 : mExprs.get(mN - k)) {
            t.add(new Pow(ch1, ch2));
          }
        }
      }
      mExprs.add(t);
    }
    final TreeSet<CR> uniq = new TreeSet<>((x, y) -> x.compareTo(y, ACCURACY));
    for (final Expr expr : mExprs.get(mN)) {
      final CR value = eval(log(log(expr)));
      uniq.add(value);
    }
    return uniq;
  }

  @Override
  public Z next() {
    final TreeSet<CR> uniq = step();
    return Z.valueOf(uniq.size());
  }
}
