package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072389 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mN).multiply(mN + 1)) >= 0) {
      final Z t = Z.valueOf(mN).multiply(mN + 1);
      for (long k = 1; k <= mN; ++k) {
        mA.add(t.multiply(Z.valueOf(k).multiply(k + 1)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
