package irvine.oeis.a005;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005276 Betrothed (or quasi-amicable) numbers.
 * @author Sean A. Irvine
 */
public class A005276 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private Z mN = Z.valueOf(47);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Functions.SIGMA.z(mN).subtract(mN).subtract(1);
      if (s.compareTo(mN) > 0) {
        final Z t = Functions.SIGMA.z(s).subtract(s).subtract(1);
        if (t.equals(mN)) {
          mPriority.add(mN);
          mPriority.add(s);
        }
      }
      if (!mPriority.isEmpty() && mN.compareTo(mPriority.first()) >= 0) {
        return mPriority.pollFirst();
      }
    }
  }
}

