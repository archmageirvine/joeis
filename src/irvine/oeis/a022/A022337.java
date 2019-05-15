package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a003.A003593;

/**
 * A022337 Exponent of <code>5</code> (value of <code>j)</code> in n-th number of form <code>3^i*5^j</code>.
 * @author Sean A. Irvine
 */
public class A022337 extends A003593 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.ord(Z.FIVE, super.next()));
  }
}
