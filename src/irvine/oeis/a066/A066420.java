package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicLongArray;

/**
 * A066272.
 * @author Sean A. Irvine
 */
public class A066420 extends Sequence2 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final int size = Euler.inversePhi(Euler.phi(++mM)).size();
      if (mFirsts.get(size) == 0) {
        mFirsts.set(size, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
