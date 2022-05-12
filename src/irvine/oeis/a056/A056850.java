package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056850 Minimal absolute difference of 3^n and 2^k.
 * @author Sean A. Irvine
 */
public class A056850 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    final int c = mN.bitLength();
    final Z t = Z.ONE.shiftLeft(c - 1);
    return mN.subtract(t).min(t.multiply2().subtract(mN));
  }
}
