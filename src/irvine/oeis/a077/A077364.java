package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077364 Largest n-digit square whose external digits as well as internal digits form a square, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077364 extends Sequence1 {

  private int mN = 0;

  private boolean checkInnerSquare(final String s) {
    return new Z(s.substring(1, s.length() - 1)).isSquare();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NINE;
    }
    if (mN == 2) {
      return Z.valueOf(81);
    }
    final StringBuilder base = new StringBuilder("1");
    base.append("0".repeat(mN - 1));
    final Z lim = new Z(base).sqrt();
    Z b = new Z(base.append("0")).sqrt();
    //System.out.println("base=" + base + " lim="+lim);
    while (b.compareTo(lim) >= 0) {
      final Z s = b.square();
      final long r = s.mod(10);
      if (r == 1) {
        final String ss = s.toString();
        if (ss.charAt(0) == '8' && checkInnerSquare(ss)) {
          return s;
        }
      } else if (r == 4) {
        final String ss = s.toString();
        if (ss.charAt(0) == '6' && checkInnerSquare(ss)) {
          return s;
        }
      } else if (r == 5) {
        final String ss = s.toString();
        if (ss.charAt(0) == '2' && checkInnerSquare(ss)) {
          return s;
        }
      } else if (r == 6) {
        final String ss = s.toString();
        final char c = ss.charAt(0);
        if ((c == '1' || c == '3') && checkInnerSquare(ss)) {
          return s;
        }
      } else if (r == 9) {
        final String ss = s.toString();
        if (ss.charAt(0) == '4' && checkInnerSquare(ss)) {
          return s;
        }
      }
      b = b.subtract(1);
    }
    return Z.ZERO;
  }
}


