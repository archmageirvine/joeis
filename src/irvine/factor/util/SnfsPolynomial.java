package irvine.factor.util;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * Automated construction of SNFS polynomial files for numbers in very
 * precise input formats.  Originally written to automatically generate
 * SNFS files for entries in <code>factordb</code>.
 *
 * @author Sean A. Irvine
 */
public final class SnfsPolynomial {

  private SnfsPolynomial() { }

  private static int sLimit = 155;

  private static void printPoly(final Z n, final Z c5, final Z c0, final Z y0) {
    final double difficulty = Math.log10(y0.pow(5).doubleValue());
    //System.err.println("SNFS difficulty: " + difficulty);
    if (difficulty > sLimit) {
      return;
    }
    System.out.println("name: poly");
    System.out.println("n: " + n);
    System.out.println("c5: " + c5);
    System.out.println("c4: 0");
    System.out.println("c3: 0");
    System.out.println("c2: 0");
    System.out.println("c1: 0");
    System.out.println("c0: " + c0);
    System.out.println("Y1: 1");
    System.out.println("Y0: " + y0.negate());
    System.out.println("type: snfs");
  }

  private static void polyAA(final Z n, final Z a, final Z b, final int e, final Z c) {
    final FactorSequence fs = Cheetah.factor(b);
    Z c0 = a;
    Z c5 = c;
    Z y0 = Z.ONE;
    for (final Z p : fs.toZArray()) {
      int exp = e * fs.getExponent(p);
      while (Z.ZERO.equals(c0.mod(p))) {
        c0 = c0.divide(p);
        ++exp;
      }
      while (Z.ZERO.equals(c5.mod(p))) {
        c5 = c5.divide(p);
        --exp;
      }
      switch (exp % 5) {
      case 1:
        c0 = c0.multiply(p);
        y0 = y0.multiply(p.pow(exp / 5));
        break;
      case 2:
        c0 = c0.multiply(p).multiply(p);
        y0 = y0.multiply(p.pow(exp / 5));
        break;
      case 3:
        c5 = c5.multiply(p).multiply(p);
        y0 = y0.multiply(p.pow(exp / 5 + 1));
        break;
      case 4:
        c5 = c5.multiply(p);
        y0 = y0.multiply(p.pow(exp / 5 + 1));
        break;
      default: // e == 0
        y0 = y0.multiply(p.pow(exp / 5));
        break;
      }
    }
    printPoly(n, c0, c5, y0);
  }

  private static void polyA(final Z a, final Z b, final int e, final Z c, final Z d) {
    final Z n = b.pow(e).multiply(a).add(c).divide(d);
    final Z g = a.gcd(c);
    polyAA(n, a.divide(g), b, e, c.divide(g));
  }

  private static final Z FIFTY_THOUSAND = Z.valueOf(50000);

  private static void polyA(final String expr) {
    final int div = expr.indexOf('/');
    final Z d = new Z(expr.substring(div + 1));
    final int exp = expr.indexOf('^');
    final Z b = new Z(expr.substring(1, exp));
    final int mul = expr.indexOf('*', exp);
    final int e = Integer.parseInt(expr.substring(exp + 1, mul));
    final int plus = expr.indexOf('+', mul);
    final int pos = plus == -1 ? expr.indexOf('-', mul) : plus;
    final Z a = new Z(expr.substring(mul + 1, pos));
    final int close = expr.indexOf(')', pos);
    final Z c = new Z(expr.substring(pos + (expr.charAt(pos) == '+' ? 1 : 0), close));
    if (b.compareTo(FIFTY_THOUSAND) <= 0) {
      polyA(a, b, e, c, d);
    }
  }

  private static void polyA1(final String expr) {
    final int div = expr.indexOf('/');
    final Z d = new Z(expr.substring(div + 1));
    final int exp = expr.indexOf('^');
    final Z b = new Z(expr.substring(1, exp));
    final int plus = expr.indexOf('+', exp);
    final int pos = plus == -1 ? expr.indexOf('-', exp) : plus;
    final int e = Integer.parseInt(expr.substring(exp + 1, pos));
    final int close = expr.indexOf(')', pos);
    final Z c = new Z(expr.substring(pos + (expr.charAt(pos) == '+' ? 1 : 0), close));
    if (b.compareTo(FIFTY_THOUSAND) <= 0) {
      polyA(Z.ONE, b, e, c, d);
    }
  }

  private static void polyA2(final String expr) {
    final int exp = expr.indexOf('^');
    final Z b = new Z(expr.substring(0, exp));
    final int plus = expr.indexOf('+', exp);
    final int pos = plus == -1 ? expr.indexOf('-', exp) : plus;
    final int e = Integer.parseInt(expr.substring(exp + 1, pos));
    final Z c = new Z(expr.substring(pos + (expr.charAt(pos) == '+' ? 1 : 0)));
    if (b.compareTo(FIFTY_THOUSAND) <= 0) {
      polyA(Z.ONE, b, e, c, Z.ONE);
    }
  }

  private static void polyA3(final String expr) {
    final int exp = expr.indexOf('^');
    final Z b = new Z(expr.substring(0, exp));
    final int mul = expr.indexOf('*', exp);
    final int e = Integer.parseInt(expr.substring(exp + 1, mul));
    final int plus = expr.indexOf('+', mul);
    final int pos = plus == -1 ? expr.indexOf('-', mul) : plus;
    final Z a = new Z(expr.substring(mul + 1, pos));
    final Z c = new Z(expr.substring(pos + (expr.charAt(pos) == '+' ? 1 : 0)));
    if (b.compareTo(FIFTY_THOUSAND) <= 0) {
      polyA(a, b, e, c, Z.ONE);
    }
  }

  /**
   * If possible, generate an SNFS polynomial for an expression.
   * @param args expression
   */
  public static void main(final String[] args) {
    if (args == null || args.length < 1) {
      System.err.println("Usage: SnfsPolynomial expression");
      return;
    }
    final int ep;
    if ("--limit".equals(args[0])) {
      ep = 2;
      sLimit = Integer.parseInt(args[1]);
    } else {
      ep = 0;
    }
    final String expr = args[ep];
    if (expr.matches("\\([0-9]+\\^[0-9]+\\*[0-9]+[+-][0-9]+\\)/[0-9]+")) {
      // (b^e*a[+-]c)/d
      polyA(expr);
    } else if (expr.matches("\\([0-9]+\\^[0-9]+[+-][0-9]+\\)/[0-9]+")) {
      // (b^e[+-]c)/d
      polyA1(expr);
    } else if (expr.matches("[0-9]+\\^[0-9]+[+-][0-9]+")) {
      // b^e[+-]c
      polyA2(expr);
    } else if (expr.matches("[0-9]+\\^[0-9]+\\*[0-9]+[+-][0-9]+")) {
      // b^e*a[+-]c
      polyA3(expr);
    }
  }
}
