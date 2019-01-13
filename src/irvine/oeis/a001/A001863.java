package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001863.
 * @author Sean A. Irvine
 */
public class A001863 implements Sequence {

  private final MemoryFactorial mFactorial = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z m = Z.ONE;
    for (int k = 0; k <= mN - 2; ++k) {
      s = s.add(mFactorial.factorial(mN - 2).multiply(m).divide(mFactorial.factorial(k)));
      m = m.multiply(mN);
    }
    return s;
  }
}
