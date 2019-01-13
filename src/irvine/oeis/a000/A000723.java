package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000723.
 * @author Sean A. Irvine
 */
public class A000723 implements Sequence {

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
