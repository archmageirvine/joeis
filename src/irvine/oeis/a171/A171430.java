package irvine.oeis.a171;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A171430 Primes that are congruent to 3 mod n, where n is the index of the prime.
 * @author Sean A. Irvine
 */
public class A171430 extends A000040 {

  private long mN = 0;
  private final int mMod;

  /** Construct the sequence. */
  public A171430() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param mod modulus
   */
  public A171430(final int mod) {
    mMod = mod;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (p.subtract(mMod).mod(mN) == 0) {
        return p;
      }
    }
  }
}
