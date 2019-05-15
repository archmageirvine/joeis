package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a003.A003592;

/**
 * A022333 Exponent of <code>5</code> (value of <code>j)</code> in n-th number of form <code>2^i*5^j</code>.
 * @author Sean A. Irvine
 */
public class A022333 extends A003592 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.ord(Z.FIVE, super.next().makeOdd()));
  }
}
