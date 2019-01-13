package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002593.
 * @author Sean A. Irvine
 */
public class A002593 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return n2.multiply(n2.multiply2().subtract(1));
  }
}
