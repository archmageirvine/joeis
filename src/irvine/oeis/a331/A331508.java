package irvine.oeis.a331;

import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A331508.
 * @author Sean A. Irvine
 */
public class A331508 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    if (m == 0 || n == 1) {
      return Z.ONE;
    }
    if (n == 0) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    return new PalmerSymPowerCycleIndex().cycleIndex(n, n * m).applyOnePlusXToTheN(m).coeff(m).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
