package irvine.oeis.a116;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A116447 a(2n) = n, a(2n+1) = n!.
 * @author Georg Fischer
 */
public class A116447 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? Z.valueOf(mN / 2) : MemoryFactorial.SINGLETON.factorial(mN / 2);
  }
}
