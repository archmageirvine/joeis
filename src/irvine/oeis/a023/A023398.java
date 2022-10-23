package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023398 If any power of 2 ends with k 2's and 5's, they must be the first k terms of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023398 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply2().add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
      return Z.TWO;
    } else {
      mA = mS.multiply(5).add(mA);
      return Z.FIVE;
    }
  }
}
