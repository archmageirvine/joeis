package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079076 Numerator of Sum{n/d : 1&lt;d&lt;n and n mod d &gt; 0}.
 * @author Sean A. Irvine
 */
public class A079076 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (long k = 1; k < mN; ++k) {
      if (mN % k != 0) {
        s = s.add(new Q(1, k));
      }
    }
    return s.multiply(mN).num();
  }
}
