package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023415 If any power of 2 ends with k <code>8</code>'s and <code>9</code>'s, they must be the first k elements of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023415 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(8).add(mA);
    if (Z.ZERO.equals(a.mod(mT))) {
      mA = a;
      return Z.EIGHT;
    } else {
      mA = mS.multiply(9).add(mA);
      return Z.NINE;
    }
  }
}
