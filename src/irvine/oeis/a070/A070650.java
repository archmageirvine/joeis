package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 6 27 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070650 n^6 mod 27.
 * @author Georg Fischer
 */
public class A070650 implements Sequence {

  private int mN = 0;
  private final Z mExp = Z.SIX;
  private final Z mMod = Z.valueOf(27);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
