package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056864 Nearest integer to n^2/10.
 * @author Sean A. Irvine
 */
public class A056864 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(5).divide(10);
  }
}

