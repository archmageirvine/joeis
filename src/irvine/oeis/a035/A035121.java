package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035121 Numbers of the form x^2+82*y^2.
 * @author Sean A. Irvine
 */
public class A035121 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mS) >= 0) {
      for (long k = 0; k <= mN; ++k) {
        mA.add(mS.add(Z.valueOf(k).square().multiply(82)));
      }
      final Z s = mS.multiply(82);
      for (long k = 0; k <= mN; ++k) {
        mA.add(s.add(Z.valueOf(k).square()));
      }
      mS = Z.valueOf(++mN).square();
    }
    return mA.pollFirst();
  }
}
