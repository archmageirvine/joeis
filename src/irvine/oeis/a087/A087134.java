package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A087134 Smallest number having exactly n divisors that are not greater than the number's greatest prime factor.
 * @author Sean A. Irvine
 */
public class A087134 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final Z gpf = fs.largestPrimeFactor();
      int cnt = 0;
      for (final Z d : fs.divisors()) {
        if (d.compareTo(gpf) <= 0) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
