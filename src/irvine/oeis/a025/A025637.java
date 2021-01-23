package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A025637 Exponent of 2 (value of i) in n-th number of form 2^i*7^j.
 * @author Sean A. Irvine
 */
public class A025637 extends A003591 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary());
  }
}
