package irvine.oeis.a036;
// Generated by gen_seq4.pl modpow2 5 157 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036149 5^n mod 157.
 * @author Georg Fischer
 */
public class A036149 extends Sequence0 {

  private int mN = 0;
  private final Z mBase = Z.FIVE;
  private final Z mMod = Z.valueOf(157);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
