package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A046806 Largest number m with A046805(m) = n.
 * @author Sean A. Irvine
 */
public class A046806 extends A046805 {

  private static final long HEURISTIC = 10;
  private final DynamicLongArray mA = new DynamicLongArray();
  private long mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) > mM - HEURISTIC * mN) {
      // We saw an occurrence of mN within the last HEURISTIC * mN values, so keep
      // checking there might be another occurrence.
      ++mM;
      final int v = super.next().intValueExact();
      if (v < mN) {
        throw new RuntimeException("Heuristic failed found a later occurrence of " + v);
      }
      mA.set(v, mM);
    }
    return Z.valueOf(mA.get(mN));
  }
}
