package irvine.oeis.a058;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058027 Sum of terms of continued fraction for n-th harmonic number, 1 + 1/2 + 1/3 + ... + 1/n.
 * @author Sean A. Irvine
 */
public class A058027 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();

  static Z continuedFractionSum(Q n) {
    Z sum = Z.ZERO;
    while (true) {
      final Z t = n.toZ();
      sum = sum.add(t);
      n = n.subtract(t);
      if (Q.ZERO.equals(n)) {
        return sum;
      }
      n = n.reciprocal();
    }
  }

  @Override
  public Z next() {
    return continuedFractionSum(mH.nextQ());
  }
}
