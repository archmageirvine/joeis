package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037021 Greedy sequence such that no term is the average of four others.
 * @author Sean A. Irvine
 */
public class A037021 extends Sequence1 {

  private static final long[] R = {0, 1, 2, 3, 5, 7, 13, 26, 27, 28, 29, 31};
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mM = 0;
  private Z mN = Z.ZERO;

  private boolean isOk(long m) {
    while (m != 0) {
      if (m % 5 > 1) {
        return false;
      }
      m /= 5;
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first().compareTo(mN) >= 0) {
      for (final long r : R) {
        mA.add(mN.add(r));
      }
      do {
        ++mM;
        mN = mN.add(122);
      } while (!isOk(mM));
    }
    return mA.pollFirst();
  }
}
