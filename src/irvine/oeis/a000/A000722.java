package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000722 Number of invertible Boolean functions of n variables: <code>a(n) = (2^n)!</code>.
 * @author Sean A. Irvine
 */
public class A000722 implements Sequence {

  int mN = -1;

  @Override
  public Z next() {
    int f = 1 << ++mN;
    Z p = Z.ONE;
    while (f > 1) {
      p = p.multiply(f--);
    }
    return p;
  }
}
