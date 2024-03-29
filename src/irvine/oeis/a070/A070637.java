package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 6 14 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070637 a(n) = n^6 mod 14.
 * @author Georg Fischer
 */
public class A070637 extends Sequence0 {

  private int mN = 0;
  private final Z mExp = Z.SIX;
  private final Z mMod = Z.valueOf(14);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
