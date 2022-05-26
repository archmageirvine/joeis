package irvine.oeis.a127;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A127230 a(n) = (2n)! - 1.
 * @author Georg Fischer
 */
public class A127230 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return MemoryFactorial.SINGLETON.factorial(++mN * 2).subtract(1);
  }
}
