package irvine.oeis.a002;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002321 Mertens's function: Sum_{k=1..n} mu(k), where mu is the Moebius function A008683.
 * @author Sean A. Irvine
 */
public class A002321 extends Sequence1 {

  private long mLimit = 1000000;
  protected long mN = 0;
  private Mobius mMobius = new Mobius(mLimit);

  @Override
  public Z next() {
    if (++mN >= mLimit) {
      mLimit *= 10;
      mMobius = new Mobius(mLimit);
    }
    return Z.valueOf(mMobius.mertens(mN));
  }
}
