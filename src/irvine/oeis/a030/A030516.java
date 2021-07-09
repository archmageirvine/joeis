package irvine.oeis.a030;
// manually

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030516 Numbers with 7 divisors. 6th powers of primes.
 * @author Georg Fischer
 */
public class A030516 extends A000040 {

  protected final int mK; // exact number of divisors
  
  /** Construct the sequence. */
  public A030516() {
    this(7);
  }
  
  /** 
   * Generalized constructor with parameter (k prime).
   * @param k number of divisors
   */
  public A030516(final int k) {
    mK = k - 1;
  }

  @Override
  public Z next() {
    return super.next().pow(mK);
  }
}
