package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000884 Number of switching networks with C(2,n) acting on the domain and AG(3,2) acting on the domain.
 * @author Sean A. Irvine
 */
public class A000884 extends Sequence1 {

  private static final Z Z42 = Z.valueOf(42);
  private static final Z Z92 = Z.valueOf(92);
  private static final Z Z168 = Z.valueOf(168);
  private static final Z Z224 = Z.valueOf(224);
  private static final Z Z384 = Z.valueOf(384);
  private static final Z Z448 = Z.valueOf(448);

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int tn = 1 << mN;
    final int tm = 1 << (mN - 1);
    return Z224.shiftLeft(tn)
      .add(Z42.shiftLeft(2 * tn))
      .add(Z.ONE.shiftLeft(3 * tn))
      .add(Z448.shiftLeft(tm + mN))
      .subtract(Z448.shiftLeft(tm))
      .add(Z92.shiftLeft(mN + tn + tm))
      .subtract(Z92.shiftLeft(tn + tm))
      .add(Z384.shiftLeft(mN))
      .add(Z168.shiftLeft(mN + tn))
      .shiftRight(mN)
      .divide(1344);
  }
}
