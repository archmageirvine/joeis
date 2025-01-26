package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074735 Number of steps to reach an integer starting with (n+3)/4 and iterating the map x -&gt; x*ceiling(x).
 * @author Sean A. Irvine
 */
public class A074735 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    Q t = new Q(++mN, 4);
    long cnt = 0;
    while (!t.isInteger()) {
      t = t.multiply(t.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
