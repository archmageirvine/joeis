package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393128 Positive integers not of the form floor(k + log(k) + log(Pi)).
 * @author Sean A. Irvine
 */
public class A393128 extends Sequence1 {

  private long mN = 0;
  private Z mBigN = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mBigN = CR.E.multiply(mBigN).round().subtract(mN);
    Z k = mBigN.add(CR.PI.multiply(mBigN).log().floor());
    while (true) {
      final Z prev = k;
      k = mBigN.add(CR.PI.multiply(mBigN).log().floor());
      if (prev.add(1).compareTo(k) < 0) {
        break;
      }
      mBigN = mBigN.add(1);
    }
    return k.subtract(1);
  }
}
