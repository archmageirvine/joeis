package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392974 allocated for Nishant R. Gautam.
 * @author Sean A. Irvine
 */
public class A392974 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.z(mN++).equals(Functions.SOPFR.z(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
