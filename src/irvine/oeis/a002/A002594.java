package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002594 a(n) = n^2*(16*n^4-20*n^2+7)/3.
 * @author Sean A. Irvine
 */
public class A002594 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return n2.multiply(n2.square().multiply(16).subtract(n2.multiply(20)).add(7)).divide(3);
  }
}
