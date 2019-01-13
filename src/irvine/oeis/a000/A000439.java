package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000439.
 * @author Sean A. Irvine
 */
public class A000439 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n2 = n.square();
    return n2.square()
      .add(n2.multiply(n).multiply(18))
      .add(n2.multiply(83))
      .add(n.multiply(114))
      .divide(24);
  }
}
