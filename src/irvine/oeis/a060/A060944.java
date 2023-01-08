package irvine.oeis.a060;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060944 a(n) = n!^2 * Sum_{k=1..n} Sum_{j=1..k} 1/j^2.
 * @author Sean A. Irvine
 */
public class A060944 extends Sequence1 {

  private int mN = 0;
  private Z mF2 = Z.ONE;

  @Override
  public Z next() {
    mF2 = mF2.multiply(++mN).multiply(mN);
    return Integers.SINGLETON.sum(0, mN - 1, k -> mF2.multiply(k + 1).divide(mN - k).divide(mN - k));
  }
}
