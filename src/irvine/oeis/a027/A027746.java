package irvine.oeis.a027;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027746.
 * @author Sean A. Irvine
 */
public class A027746 implements Sequence {

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
      final FactorSequence fs = Cheetah.factor(mN);
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
