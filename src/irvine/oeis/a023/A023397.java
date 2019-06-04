package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023397 In base 10, if any power of 2 ends with k <code>2</code>'s and <code>3</code>'s, they must be the first k elements of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023397 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply2().add(mA);
    if (Z.ZERO.equals(a.mod(mT))) {
      mA = a;
      return Z.TWO;
    } else {
      mA = mS.multiply(3).add(mA);
      return Z.THREE;
    }
  }
}
