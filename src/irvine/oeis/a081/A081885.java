package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081885 Number of steps needed to reach an integer starting with n+1/16 and iterating the map x--&gt;x*ceiling(x).
 * @author Sean A. Irvine
 */
public class A081885 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Q v = new Q(16 * ++mN + 1, 16);
    long cnt = 0;
    while (!v.isInteger()) {
      v = v.multiply(v.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
