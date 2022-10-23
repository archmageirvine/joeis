package irvine.oeis.a055;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000587;

/**
 * A055925 Exponential reciprocal of A055924.
 * @author Sean A. Irvine
 */
public class A055925 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Sequence mCompBell = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mCompBell = new A000587();
      mCompBell.next(); // skip 0
      mM = 1;
    }
    return mCompBell.next().multiply(Stirling.firstKind(mN, mM));
  }
}
