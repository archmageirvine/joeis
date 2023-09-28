package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066033 Alternating sum of primes: a(1) = A000040(1) = 2 and a(n) = a(n-1) + A000040(n)*(-1)^n for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A066033 extends A000040 {

  private Z mSum = Z.FOUR;
  private boolean mSign = true;

  @Override
  public Z next() {
    mSign = !mSign;
    mSum = mSum.signedAdd(mSign, super.next());
    return mSum;
  }
}
