package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061505 Leading digit of n^n.
 * @author Sean A. Irvine
 */
public class A061505 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    return nn.divide(Z.TEN.pow(CR.valueOf(nn).log10().floor()));
  }
}

