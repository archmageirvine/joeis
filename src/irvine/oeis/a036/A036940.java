package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a020.A020461;

/**
 * A036940 Smallest n-digit prime containing only digits 3 and 4, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A036940 extends A020461 {

  private int mLen = 0;
  private final char mLo;
  private final char mHi;

  protected A036940(final char lo, final char hi) {
    mLo = lo;
    mHi = hi;
  }

  /** Construct the sequence. */
  public A036940() {
    this('3', '4');
  }

  @Override
  public Z next() {
    Z n = Z.ONE.shiftLeft(++mLen);
    while (true) {
      final String s = n.toString(2).substring(1);
      System.out.println(mLen + " " + s);
      if (s.length() > mLen) {
        return Z.ZERO; // no solution
      }
      final Z m = new Z(s.replace('1', mHi).replace('0', mLo));
      if (m.isProbablePrime()) {
        return m;
      }
      n = n.add(1);
    }
  }
}
