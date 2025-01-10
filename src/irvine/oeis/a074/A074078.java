package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A074078 Number of steps to reach an integer starting with s = n/3 and iterating the map x -&gt; s*ceiling(x).
 * @author Sean A. Irvine
 */
public class A074078 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final Q s = new Q(++mN, 3);
    long cnt = 0;
    Q x = s;
    while (!x.isInteger()) {
      ++cnt;
      x = s.multiply(x.ceiling());
    }
    return Z.valueOf(cnt);
  }
}
