package irvine.oeis.a036;
// Generated by gen_seq4.pl modpow2 2 173 at 2020-03-09 17:27
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036152 a(n) = 2^n mod 173.
 * @author Georg Fischer
 */
public class A036152 extends Sequence0 {

  private int mN = 0;
  private final Z mBase = Z.TWO;
  private final Z mMod = Z.valueOf(173);

  @Override
  public Z next() {
    return mBase.modPow(Z.valueOf(mN++), mMod);
  }
}
