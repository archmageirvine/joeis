package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000723 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000723 extends Sequence1 {

  int mN = 0;

  @Override
  public Z next() {
    int t = (1 << ++mN) - 1;
    Z f = Z.ONE;
    while (t > mN) {
      f = f.multiply(t--);
    }
    return f;
  }
}
