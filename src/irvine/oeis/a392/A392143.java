package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390129.
 * @author Sean A. Irvine
 */
public class A392143 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).subtract(1).pow(mN);
  }
}
