package irvine.oeis.a238;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A238689 Table read by rows: first row is {1}; for n &gt;1, T(n, k) is the k-th largest prime factor of n (repeated prime factors are counted repeatedly).
 * @author Georg Fischer
 */
public class A238689 extends Sequence1 {

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
          mList.add(0, p); // copied from A027746
        }
      }
      mM = 0;
    }
    return mList.get(mM);
  }
}
