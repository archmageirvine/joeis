package irvine.oeis.a027;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027746 Irregular triangle in which first row is 1, n-th row (n&gt;1) gives prime factors of n with repetition.
 * @author Sean A. Irvine
 */
public class A027746 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<Z> mList = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.size()) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mList.clear();
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          mList.add(p);
        }
      }
      mM = 0;
    }
    return mList.get(mM);
  }
}
