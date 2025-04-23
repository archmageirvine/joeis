package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a073.A073904;

/**
 * A076931 Smallest k such that n*k has n divisors.
 * @author Sean A. Irvine
 */
public class A076931 extends A073904 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

