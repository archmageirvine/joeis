package irvine.oeis.a058;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058790.
 * @author Sean A. Irvine
 */
public class A058790 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex z = new PalmerSymPowerCycleIndex().cycleIndex(3, 3 * ++mN);
    return z.applyOnePlusXToTheN(mN).coeff(mN).toZ();
  }
}
