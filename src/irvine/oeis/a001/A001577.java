package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001577 An operational recurrence.
 * @author Sean A. Irvine
 */
public class A001577 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Functions.FIBONACCI.z(k).pow(Functions.FIBONACCI.z(mN - k)));
    }
    return p;
  }
}
