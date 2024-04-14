package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061323 Primes with 10 as smallest positive primitive root.
 * Copied from A001126.
 * @author Georg Fischer
 */
public class A061323 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mRoot;

  /** Construct the sequence. */
  public A061323() {
    this(10);
  }

  /**
   * Generic constructor with parameter
   * @param root
   */
  public A061323(final int root) {
    mRoot = Z.valueOf(root);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mRoot.equals(Functions.LEAST_PRIMITIVE_ROOT.z(mP))) {
        return mP;
      }
    }
  }
}

