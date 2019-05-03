package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000186 Number of <code>3 X n</code> Latin rectangles in which the first row is in order.
 * @author Sean A. Irvine
 */
public class A000186 implements Sequence, Serializable {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final Z nf = mF.factorial(mN);
    for (int j = 0; j <= mN; ++j) {
      Z t = Z.ZERO;
      for (int k = 0; k <= mN - j; ++k) {
        t = t.add(mF.factorial(k).multiply(Binomial.binomial(-3 * (k + 1), mN - k - j)));
      }
      s = s.add(t.multiply(nf.divide(mF.factorial(j))).shiftLeft(j));
    }
    return s;
  }
}

