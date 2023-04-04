package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062683 Numbers that are products of all rotations of some number.
 * @author Sean A. Irvine
 */
public class A062683 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;
  private Z mMul = Z.ONE;
  private Z mLim = Z.TEN;
  private int mDigits = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mN.compareTo(mA.first()) <= 0) {
      Z prod = Z.ONE;
      Z t = mN;
      for (int k = 0; k < mDigits; ++k) {
        prod = prod.multiply(t);
        t = t.divide(10).add(mMul.multiply(t.mod(10)));
      }
      mA.add(prod);
      mN = mN.add(1);
      if (mN.equals(mLim)) {
        ++mDigits;
        mMul = mLim;
        mLim = mLim.multiply(10);
      }
    }
    return mA.pollFirst();
  }
}
