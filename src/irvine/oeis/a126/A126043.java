package irvine.oeis.a126;
// manually 

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A126043 Exponents p of the Mersenne primes 2^p - 1 (see A000043) read mod 3.
 * @author Georg Fischer
 */
public class A126043 extends A000043 {

  protected Z mK; // mod k
  
  /** Construct the sequence. */
  public A126043() {
    this(3);
  }
  
  /**
   * Generic constructor with parameter
   * @param k apply A000043(n) mod k
   */
  public A126043(final long k) {
    mK = Z.valueOf(k);
  }
  
  @Override
  public Z next() {
    return super.next().mod(mK);
  }
}
