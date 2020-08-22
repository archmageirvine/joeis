package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023399 If any power of 2 ends with k 2's and 7's, they must be the first k elements of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023399 implements Sequence {

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
      mA = mS.multiply(7).add(mA);
      return Z.SEVEN;
    }
  }
}
