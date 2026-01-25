package irvine.oeis.a392;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392689 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A392689 extends Sequence0 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }


  @Override
  public Z next() {
    final Q h;
    if (++mN == 0) {
      h = Q.ZERO;
    } else {
      mH.nextQ(); // skip odd
      h = mH.nextQ();
    }
    return select(h.multiply(Z.NEG_ONE.pow(mN - 1)).divide(2 * mN + 1));
  }
}
