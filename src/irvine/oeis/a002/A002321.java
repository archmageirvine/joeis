package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.Mobius;

/**
 * A002321 Mertens's function: <code>Sum_{k=1..n} mu(k)</code>, where mu is the Moebius function <code>A008683</code>.
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
