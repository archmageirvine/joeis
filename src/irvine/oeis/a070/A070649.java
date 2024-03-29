package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 6 26 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070649 a(n) = n^6 mod 26.
 * @author Georg Fischer
 */
public class A070649 extends Sequence0 {

  private int mN = 0;
  private final Z mExp = Z.SIX;
  private final Z mMod = Z.valueOf(26);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
