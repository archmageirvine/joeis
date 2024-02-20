package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068496 n! reduced mod 2^n.
 * @author Sean A. Irvine
 */
public class A068496 extends Sequence1 {

  private long mN = 0;
  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mMod = mMod.multiply2();
    Z f = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      f = f.modMultiply(Z.valueOf(k), mMod);
    }
    return f;
  }
}

