package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002994 Initial digit of cubes.
 * @author Sean A. Irvine
 */
public class A002994 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(mN.pow(3).toString().charAt(0) - '0');
  }
}
