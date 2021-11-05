package irvine.oeis.a055;
// manually deris2/primeval at 2021-11-04 22:44

import irvine.math.z.Z;
import irvine.oeis.PrimeSubsequence;
import irvine.oeis.a054.A054632;

/**
 * A055058 Primes in A054632.
 * @author Georg Fischer
 */
public class A055058 extends PrimeSubsequence {
    
  private Z mPrev = Z.ZERO;

  /** Construct the sequence. */
  public A055058() {
    super(new A054632());
  }
  
  @Override
  public Z next() {
    Z result = super.next();
    while (result.equals(mPrev)) {
      result = super.next();
    }
    mPrev = result;
    return result;
  }
}
