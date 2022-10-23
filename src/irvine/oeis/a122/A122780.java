package irvine.oeis.a122;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A122780 Nonprimes k such that 3^k == 3 (mod k).
 * @author Georg Fischer
 */
public class A122780 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mBase;
  private Z mRes;

  /** Construct the sequence. */
  public A122780() {
    this(3, 3);
  }

  /**
   * Generic constructor with parameters
   * @param base power base
   * @param res residue
   */
  public A122780(final int base, final int res) {
    mBase = Z.valueOf(base);
    mRes = Z.valueOf(res);
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final Z n = Z.valueOf(mN);
        if (mBase.modPow(n, n).equals(mRes.mod(n))) {
          return n;
        }
      }
    }
  }
}
