package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A081882 Number of steps needed to reach an integer starting with n-1/4 and iterating the map x -&gt;x*ceiling(x).
 * @author Sean A. Irvine
 */
public class A081882 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Q v = new Q(4 * ++mN - 1, 4);
    long cnt = 0;
    while (!v.isInteger()) {
      v = v.multiply(v.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
