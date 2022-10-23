package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000070;
import irvine.oeis.a036.A036469;

/**
 * A058228 Numbers k that divide the difference between the sum of the first k partition numbers (A000041) and the sum of the first k unique partition numbers (A000009).
 * @author Sean A. Irvine
 */
public class A058228 extends Sequence1 {

  private final Sequence mP = new A000070();
  private final Sequence mQ = new A036469();
  private long mN = 0;
  {
    mP.next();
    mQ.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (mP.next().subtract(mQ.next()).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

