package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056822 Nearest integer to n^2/16.
 * @author Sean A. Irvine
 */
public class A056822 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(8).divide(16);
  }
}

