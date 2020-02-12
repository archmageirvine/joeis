package irvine.oeis.a028;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A028691 Least positive value of k for which the n-th sorted Galois number divides <code>k!</code>.
 * @author Sean A. Irvine
 */
public class A028691 extends A028689 {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    final Z a = super.next();
    int k = 0;
    while (true) {
      if (Z.ZERO.equals(mF.factorial(++k).mod(a))) {
        return Z.valueOf(k);
      }
    }
  }
}
