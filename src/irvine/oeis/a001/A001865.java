package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001865 Number of connected functions on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A001865 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z m = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      if (k > 1) {
        m = m.multiply(mN);
      }
      final Z t = mF.factorial(k == 0 ? mN - 1 : mN).multiply(m).divide(mF.factorial(k));
      s = s.add(t);
    }
    return s;
  }
}
