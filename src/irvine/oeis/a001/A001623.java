package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001623 Number of 3 X n reduced (normalized) Latin rectangles.
 * @author Sean A. Irvine
 */
public class A001623 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      Q t = Q.ZERO;
      final Z kf = mF.factorial(k);
      for (int j = 0; j <= mN - k; ++j) {
        final int i = mN - k - j;
        t = t.signedAdd((j & 1) == 0, new Q(Binomial.binomial(3L * k + j + 2, j).shiftLeft(i), mF.factorial(i)));
      }
      s = s.add(t.multiply(kf));
    }
    return s.multiply(mN).multiply(mF.factorial(mN - 3)).toZ();
  }
}

