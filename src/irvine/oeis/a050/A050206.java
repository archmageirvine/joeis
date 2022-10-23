package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A050206 Triangle read by rows: smallest denominator of the expansion of k/n using the greedy algorithm, 1&lt;=k&lt;=n-1.
 * @author Sean A. Irvine
 */
public class A050206 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    Q f = new Q(mM, mN);
    Z minDen = f.den();
    while (!f.num().equals(Z.ONE)) {
      final Q unitFraction = new Q(Z.ONE, f.den().add(f.num()).subtract(1).divide(f.num()));
      f = f.subtract(unitFraction);
      minDen = minDen.min(unitFraction.den());
    }
    return minDen;
  }
}
