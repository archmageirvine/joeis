package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A025637 Exponent of <code>2</code> (value of <code>i)</code> in n-th number of form <code>2^i*7^j</code>.
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
