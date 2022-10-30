package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058023 a(n) is the largest prime &lt; A051451(n) - 1.
 * @author Sean A. Irvine
 */
public class A058023 extends A051451 {

  {
    setOffset(3);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next().subtract(1));
  }
}
