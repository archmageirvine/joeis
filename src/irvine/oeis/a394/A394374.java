package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394374 allocated for Rayhan Ahmed.
 * @author Sean A. Irvine
 */
public class A394374 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.add(Z.valueOf(2 * mN - 1).pow(2 * mN));
    }
    return mA;
  }
}
