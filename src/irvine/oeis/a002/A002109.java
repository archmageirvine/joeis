package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002109 Hyperfactorials: Product_{k = 1..n} k^k.
 * @author Sean A. Irvine
 */
public class A002109 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(Z.valueOf(mN).pow(mN));
    }
    return mA;
  }
}
