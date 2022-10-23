package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006037 Weird numbers: abundant (A005101) but not pseudoperfect (A005835).
 * @author Sean A. Irvine
 */
public class A006037 extends Sequence1 {

  private Z mN = Z.valueOf(69);

  private boolean isPseudoperfect(final Z n, final Z[] d, final int pos, final Z sum) {
    if (sum.compareTo(n) >= 0) {
      return sum.equals(n);
    }
    if (pos < 0) {
      return false;
    }
    if (n.equals(d[pos])) {
      return isPseudoperfect(n, d, pos - 1, sum);
    }
    return isPseudoperfect(n, d, pos - 1, sum.add(d[pos])) || isPseudoperfect(n, d, pos - 1, sum);
  }

  protected boolean isWeird(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.sigma().compareTo(n.multiply2()) <= 0) {
      return false;
    }
    final Z[] d = fs.divisors();
    return !isPseudoperfect(n, d, d.length - 1, Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isWeird(mN)) {
        return mN;
      }
    }
  }
}
