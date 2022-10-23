package irvine.oeis.a127;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127231 a(n) = (2n)! + 1.
 * @author Georg Fischer
 */
public class A127231 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return MemoryFactorial.SINGLETON.factorial(++mN * 2).add(1);
  }
}
