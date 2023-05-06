package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063663 Numbers which can be written as b^2*c^2*(b^2+c^2).
 * @author Sean A. Irvine
 */
public class A063663 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }
  private long mN = 1;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mS) >= 0) {
      final Z n2 = Z.valueOf(mN).square();
      for (long k = 1; k <= mN; ++k) {
        final Z k2 = Z.valueOf(k).square();
        mA.add(n2.multiply(k2).multiply(n2.add(k2)));
      }
      mS = Z.valueOf(++mN).pow(4);
    }
    return mA.pollFirst();
  }
}
