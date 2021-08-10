package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050205 Number of terms in unit fraction representation of triangle of numbers 1/2, 1/3, 2/3, 1/4, 2/4, ... as computed with greedy algorithm.
 * @author Sean A. Irvine
 */
public class A050205 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    Q f = new Q(mM, mN);
    long cnt = 1;
    while (!f.num().equals(Z.ONE)) {
      ++cnt;
      f = f.subtract(new Q(Z.ONE, f.den().add(f.num()).subtract(1).divide(f.num())));
    }
    return Z.valueOf(cnt);
  }
}
