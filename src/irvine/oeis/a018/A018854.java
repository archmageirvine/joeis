package irvine.oeis.a018;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018854 Smallest factorial that begins with n.
 * @author Sean A. Irvine
 */
public class A018854 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (mF.factorial(++b).toString().startsWith(target)) {
        return mF.factorial(b);
      }
    }
  }
}
