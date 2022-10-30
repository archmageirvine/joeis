package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058019 a(n) is the smallest prime &gt; A051451(n)+1.
 * @author Sean A. Irvine
 */
public class A058019 extends A051451 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().add(1));
  }
}
