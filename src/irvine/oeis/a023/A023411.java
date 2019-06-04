package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023411 If any even power of 2 ends with k <code>1</code>'s and <code>8</code>'s, they must be the first k elements of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023411 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.add(mA);
    if (Z.ZERO.equals(a.mod(mT))) {
      mA = a;
      return Z.ONE;
    } else {
      mA = mS.multiply(8).add(mA);
      return Z.EIGHT;
    }
  }
}
