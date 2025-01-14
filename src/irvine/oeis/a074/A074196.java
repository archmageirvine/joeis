package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A074196 Sum of palindromes from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074196 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO; // Could argue this should be 1
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z lo = fs.leastPrimeFactor();
    final Z hi = fs.largestPrimeFactor();
    final Sequence palin = new A002113();
    Z sum = Z.ZERO;
    while (true) {
      final Z p = palin.next();
      if (p.compareTo(hi) > 0) {
        return sum;
      }
      if (p.compareTo(lo) >= 0) {
        sum = sum.add(p);
      }
    }
  }
}
