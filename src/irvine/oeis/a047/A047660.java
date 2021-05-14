package irvine.oeis.a047;

import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.a003.A003190;

/**
 * A047660 Number of self-complementary 2-plexes.
 * @author Sean A. Irvine
 */
public class A047660 extends A003190 {

  private int mN = 0;

  @Override
  public Z next() {
    return new PalmerSymPowerCycleIndex().cycleIndex(3, ++mN).eval(2, 0).toZ();
  }
}
