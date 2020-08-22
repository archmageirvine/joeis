package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A008829 Smallest number a(n) formed from consecutive sequences of digits of Pi and satisfying a(n) &gt; a(n-1); first 3 is omitted.
 * @author Sean A. Irvine
 */
public class A008829 extends A000796 {

  {
    super.next();
  }

  private Z mA = Z.ZERO;
  private Z mLookahead = super.next();

  @Override
  public Z next() {
    Z t = Z.ZERO;
    do {
      t = t.multiply(10).add(mLookahead);
      mLookahead = super.next();
    } while (t.compareTo(mA) <= 0 || Z.ZERO.equals(mLookahead));
    mA = t;
    return t;
  }
}
