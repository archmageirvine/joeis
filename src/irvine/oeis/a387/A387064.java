package irvine.oeis.a387;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387064 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A387064 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (int r = 0; r <= mN; ++r) {
      for (int k = 0; k <= r; ++k) {
        if (Binomial.binomial(r, k).mod(mN) == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
