package irvine.oeis.a055;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000110;

/**
 * A055924 Exponential transform of Stirling1 triangle A008275.
 * @author Sean A. Irvine
 */
public class A055924 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Sequence mBell = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mBell = new A000110();
      mBell.next(); // skip 0
      mM = 1;
    }
    return mBell.next().multiply(Stirling.firstKind(mN, mM));
  }
}
