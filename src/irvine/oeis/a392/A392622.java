package irvine.oeis.a392;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392622 Lexicographically least increasing sequence of positive integers so that no term is the sum of two consecutive terms, or except for the first term a partial sum of the sequence.
 * @author Sean A. Irvine
 */
public class A392622 extends Sequence1 {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mSum = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mSum = Z.ONE;
      return Z.ONE;
    }
    Z k = mA;
    while (true) {
      k = k.add(1);
      if (!mForbidden.remove(k)) {
        mForbidden.add(mA.add(k));
        mSum = mSum.add(k);
        mForbidden.add(mSum);
        mA = k;
        return mA;
      }
    }
  }
}
