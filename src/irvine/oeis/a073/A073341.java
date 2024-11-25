package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073341 Number of steps to reach an integer starting with (2n+1)/4 and iterating the map x -&gt; x*ceiling(x).
 * @author Sean A. Irvine
 */
public class A073341 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Q m = new Q(2 * ++mN + 1, 4);
    long cnt = 0;
    while (!m.isInteger()) {
      m = m.multiply(m.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

