package irvine.oeis.a329;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a057.A057977;

/**
 * A329965 a(n) = ((1+n)*floor(1+n/2))*(n!/floor(1+n/2)!)^2.
 * @author Georg Fischer
 */
public class A329965 extends A057977 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(n) = (n+1)!*A057977(n).
    ++mN;
    return MemoryFactorial.SINGLETON.factorial(mN + 1).multiply(super.next());
  }
}
