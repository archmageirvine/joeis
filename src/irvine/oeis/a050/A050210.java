package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A050210 Largest denominator in unit fraction representation of triangle of numbers 1/2, 1/3, 2/3, 1/4, 2/4, ... as computed with greedy algorithm.
 * @author Sean A. Irvine
 */
public class A050210 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    Q f = new Q(mM, mN);
    Z maxDen = Z.ONE;
    while (!f.num().equals(Z.ONE)) {
      final Q unitFraction = new Q(Z.ONE, f.den().add(f.num()).subtract(1).divide(f.num()));
      f = f.subtract(unitFraction);
      maxDen = maxDen.max(unitFraction.den());
    }
    return maxDen.max(f.den());
  }
}
