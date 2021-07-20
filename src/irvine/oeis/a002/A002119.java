package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002119 Bessel polynomial y_n(-2).
 * @author Sean A. Irvine
 */
public class A002119 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;


  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = mF.factorial(2 * mN - k).divide(mF.factorial(k)).divide(mF.factorial(mN - k));
      if (((mN - k) & 1) == 0) {
        s = s.add(t);
      } else {
        s = s.subtract(t);
      }
    }
    return s;
  }
}
