package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001269 Table T(n,k) in which n-th row lists prime factors of 2^n + 1 (n &gt;= 0), with repetition.
 * @author Sean A. Irvine
 */
public class A001269 extends Sequence0 {

  private int mN = -1;
  private final ArrayList<Z> mPending = new ArrayList<>();
  private int mPos = 0;

  protected Z base() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    if (mPos >= mPending.size()) {
      mPending.clear();
      mPos = 0;
      final FactorSequence fs = Jaguar.factor(base().pow(++mN).add(1));
      for (final Z p : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          mPending.add(p);
        }
      }
    }
    return mPending.get(mPos++);
  }
}
