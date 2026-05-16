package irvine.oeis.a395;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395591 allocated for Akimenko Daniil.
 * @author Sean A. Irvine
 */
public class A395591 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(0, mM - 1, k -> Z.valueOf(mN - k).multiply(mM - k)).multiply(4)
      .add(Integers.SINGLETON.sum(0, Math.min(mM - 1, (2 * mN - 1) / 4), k -> Z.valueOf(mM - k).multiply(2 * mN - 1 - 4 * k)).multiply2())
      .add(Integers.SINGLETON.sum(0, (2 * mM - 1) / 4, k -> Z.valueOf(mN - k).multiply(2 * mM - 1 - 4 * k)).multiply2());
  }
}
