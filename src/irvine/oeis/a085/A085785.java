package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085785 Start at (2n+1)/4 and iterate the map x -&gt; x*ceiling(x); sequence gives number of steps for denominator to drop to 1 or 2; or -1 if this never happens.
 * @author Sean A. Irvine
 */
public class A085785 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Q x = new Q(2 * ++mN + 1, 4);
    long cnt = 0;
    while (x.den().compareTo(Z.TWO) > 0) {
      ++cnt;
      x = x.multiply(x.ceiling());
    }
    return Z.valueOf(cnt);
  }
}
