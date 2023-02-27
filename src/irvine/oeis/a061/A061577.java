package irvine.oeis.a061;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061577 Sequence and first differences (A061578) include all numbers.
 * @author Sean A. Irvine
 */
public class A061577 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mC = Z.ZERO;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.TWO);
    } else if (mSeen.size() == 1) {
      mA = Z.THREE;
      mSeen.add(Z.ONE);
    } else {
      do {
        mC = mC.add(1);
      } while (mSeen.contains(mC));
      mA = mA.add(mC);
    }
    mSeen.add(mA);
    return mA;
  }
}
