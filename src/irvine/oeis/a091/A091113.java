package irvine.oeis.a091;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A091113 Nonprimes of the form 4*k+1.
 * @author Georg Fischer
 */
public class A091113 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN;
  private final int mMod;

  /** Construct the sequence. */
  public A091113() {
    this(4, 1);
  }

  /**
   * Generic constructor with parameters
   * @param mod modulus
   * @param res residue
   */
  public A091113(final int mod, final int res) {
    mMod = mod;
    mN = res - mod;
  }

  @Override
  public Z next() {
    while (true) {
      mN += mMod;
      if (!mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
