package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002415.
 * @author Sean A. Irvine
 */
public class A002415 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return n2.multiply(n2.subtract(1)).divide(12);
  }
}
