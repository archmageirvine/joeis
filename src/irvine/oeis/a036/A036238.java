package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036238 Triangle of numbers a(r,j) = j*(j+1) mod r+2, r&gt;=1, j=1..r.
 * @author Sean A. Irvine
 */
public class A036238 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM * (mM + 1) % (mN + 2));
  }
}

