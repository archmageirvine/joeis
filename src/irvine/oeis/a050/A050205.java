package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050205 Triangle read by rows: number of terms in unit fraction representation of k/n using the greedy algorithm, 1&lt;=k&lt;=n-1.
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
