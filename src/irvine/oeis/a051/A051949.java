package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051949 Differences of two factorial numbers.
 * @author Sean A. Irvine
 */
public class A051949 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 2;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || Functions.FACTORIAL.z(mN).subtract(Functions.FACTORIAL.z(mN - 1)).compareTo(mA.first()) <= 0) {
      for (int k = 1; k < mN; ++k) {
        mA.add(Functions.FACTORIAL.z(mN).subtract(Functions.FACTORIAL.z(k)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
