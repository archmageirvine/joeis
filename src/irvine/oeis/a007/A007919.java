package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007919.
 * @author Sean A. Irvine
 */
public class A007919 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int m = 0;
    while (true) {
      final Z df = mF.doubleFactorial(++m);
      if (df.mod(mN) == 0) {
        return df.divide(mN);
      }
    }
  }
}
