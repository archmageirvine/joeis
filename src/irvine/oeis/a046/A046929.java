package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046929 Width of moat of composite numbers surrounding n-th prime.
 * @author Sean A. Irvine
 */
public class A046929 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(mFast.prevPrime(p)).min(mFast.nextPrime(p).subtract(p)).subtract(1);
  }
}

