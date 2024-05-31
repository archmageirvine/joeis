package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A000558 Generalized Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A000558 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Functions.STIRLING2.z(mN, k).multiply(Functions.STIRLING2.z(k, 2)));
    }
    return s;
  }
}
