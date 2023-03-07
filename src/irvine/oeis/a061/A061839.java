package irvine.oeis.a061;

import java.util.TreeSet;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061674.
 * @author Sean A. Irvine
 */
public class A061839 extends Sequence1 {

  private Z mA = null;
  private Z mMod = Z.TEN;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FIVE;
    } else {
      final TreeSet<Z> solns = new TreeSet<>(QuadraticCongruence.solve(Z.ONE, Z.ZERO, mA.negate(), mMod));
      while (true) {
        final Z s = solns.pollFirst();
        Z sq = s.square();
        if (sq.compareTo(mA) <= 0) {
          solns.add(s.add(mMod));
        } else {
          mA = sq;
          break;
        }
      }
      while (mMod.compareTo(mA) < 0) {
        mMod = mMod.multiply(10);
      }
    }
    return mA;
  }
}

