package irvine.oeis.a036;
// Generated by gen_seq4.pl modpow2 3 113 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036142 3^n mod 113.
 * @author Georg Fischer
 */
public class A036142 extends Sequence0 {

  private int mN = 0;
  private final Z mBase = Z.THREE;
  private final Z mMod = Z.valueOf(113);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
