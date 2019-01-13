package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000722.
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
