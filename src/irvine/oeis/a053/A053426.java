package irvine.oeis.a053;

import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.a003.A003190;

/**
 * A053426 Pure 2-complexes on n nodes with at most 3 multiple 2-simplexes.
 * @author Sean A. Irvine
 */
public class A053426 extends A003190 {

  private int mN = 0;

  @Override
  public Z next() {
    return new PalmerSymPowerCycleIndex().cycleIndex(3, ++mN).eval(4).toZ();
  }
}
