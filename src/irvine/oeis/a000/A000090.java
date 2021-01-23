package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000090 E.g.f. exp((-x^3)/3)/(1-x).
 * @author Sean A. Irvine
 */
public class A000090 implements Sequence {

  private final MemoryFactorial mFactorial = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    Z u = Z.ONE;
    for (int k = 0; k <= mN / 3; ++k) {
      final Z t = mFactorial.factorial(mN).divide(mFactorial.factorial(k)).divide(u);
      r = r.signedAdd((k & 1) == 0, t);
      u = u.multiply(3);
    }
    return r;
  }

}

