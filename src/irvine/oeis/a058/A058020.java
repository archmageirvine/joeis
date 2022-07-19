package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058020 Difference between lcm(1,..,n) and the smallest prime &gt; lcm(1,...,n) + 1, where n runs over A000961, lcm(n) runs through A051451.
 * @author Sean A. Irvine
 */
public class A058020 extends A051451 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return mPrime.nextPrime(t.add(1)).subtract(t);
  }
}
