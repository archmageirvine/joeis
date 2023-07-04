package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000186 Number of 3 X n Latin rectangles in which the first row is in order.
 * @author Sean A. Irvine
 */
public class A000186 extends Sequence0 implements Serializable {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final Z nf = mF.factorial(mN);
    for (int j = 0; j <= mN; ++j) {
      Z t = Z.ZERO;
      for (int k = 0; k <= mN - j; ++k) {
        t = t.add(mF.factorial(k).multiply(Binomial.binomial(-3L * (k + 1), mN - k - j)));
      }
      s = s.add(t.multiply(nf.divide(mF.factorial(j))).shiftLeft(j));
    }
    return s;
  }
}

