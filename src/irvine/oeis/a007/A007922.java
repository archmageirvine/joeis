package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007922.
 * @author Sean A. Irvine
 */
public class A007922 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      final Z df = mF.doubleFactorial(++k);
      if (df.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
