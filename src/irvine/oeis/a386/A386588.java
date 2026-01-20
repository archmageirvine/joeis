package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386588 allocated for Alex Daley.
 * @author Sean A. Irvine
 */
public class A386588 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = Z.TWO.modPow(mA, Z.valueOf(mN));
    }
    return mA;
  }
}

