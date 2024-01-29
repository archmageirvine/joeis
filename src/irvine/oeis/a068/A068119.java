package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068109.
 * @author Sean A. Irvine
 */
public class A068119 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Q v = Q.ONE_QUARTER.add(++mN);
    long cnt = 0;
    while (!v.isInteger()) {
      v = v.multiply(v.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
