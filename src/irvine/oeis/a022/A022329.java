package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a003.A003586;

/**
 * A022329 Exponent of <code>3</code> (value of <code>j)</code> in n-th number of form <code>2^i*3^j</code> (see <code>A003586)</code>.
 * @author Sean A. Irvine
 */
public class A022329 extends A003586 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.ord(Z.THREE, super.next().makeOdd()));
  }
}
