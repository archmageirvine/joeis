package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 2 19 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070441 n^2 mod 19.
 * @author Georg Fischer
 */
public class A070441 extends Sequence0 {

  private int mN = 0;
  private final Z mExp = Z.TWO;
  private final Z mMod = Z.valueOf(19);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
