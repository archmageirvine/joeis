package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.nt.mobius.Mobius;

/**
 * A002321.
 * @author Sean A. Irvine
 */
public class A002321 implements Sequence {

  private long mLimit = 1000000;
  private long mN = 0;
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
