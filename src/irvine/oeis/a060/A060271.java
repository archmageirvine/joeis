package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060271 Difference between smallest prime following and largest prime preceding 2*(n-th prime).
 * @author Sean A. Irvine
 */
public class A060271 extends A000040 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next().multiply2();
    return mPrime.nextPrime(p).subtract(mPrime.prevPrime(p));
  }
}
