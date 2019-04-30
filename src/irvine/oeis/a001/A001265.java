package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001265 Table <code>T(n,k)</code> in which n-th row lists prime factors of <code>2^n - 1 (n &gt;= 2)</code>, with repetition.
 * @author Sean A. Irvine
 */
public class A001265 implements Sequence {

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
      final FactorSequence fs = Jaguar.factor(base().pow(++mN).subtract(1));
      for (final Z a : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(a); ++k) {
          mPending.add(a);
        }
      }
    }
    return mPending.get(mPos++);
  }
}
