package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074212 Number of steps to reach an integer starting with (2^n + 1)/2^n and iterating the map x-&gt;x*ceiling(x).
 * @author Sean A. Irvine
 */
public class A074212 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z a = Z.ONE.shiftLeft(++mN);
    Q t = new Q(a.add(1), a);
    long cnt = 0;
    while (!t.isInteger()) {
      t = t.multiply(t.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
