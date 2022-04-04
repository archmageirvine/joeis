package irvine.oeis.a028;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A028691 Least positive value of k for which the n-th sorted Galois number divides k!.
 * @author Sean A. Irvine
 */
public class A028691 extends A028689 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    final Z a = super.next();
    int k = 0;
    while (true) {
      if (mF.factorial(++k).mod(a).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
