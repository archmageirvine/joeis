package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004006.
 * @author Sean A. Irvine
 */
public class A004006 extends MemorySequence {

  private Z mN = Z.NEG_ONE;

  @Override
  protected Z computeNext() {
    mN = mN.add(1);
    return mN.square().add(Z.FIVE).multiply(mN).divide(6);
  }
}
