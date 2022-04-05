package irvine.oeis.a332;
// manually primen/primenp at 2022-04-05 20:54

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A332635 a(n) = n!! mod prime(n).
 * @author Georg Fischer
 */
public class A332635 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return MemoryFactorial.SINGLETON.doubleFactorial(mN).mod(super.next());
  }
}
