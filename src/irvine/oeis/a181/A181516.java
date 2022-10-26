package irvine.oeis.a181;
// manually deris/primeval at 2022-10-26 11:22

import irvine.math.z.Z;
import irvine.oeis.a011.A011371;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A181516 Primes in A011371.
 * @author Georg Fischer
 */
public class A181516 extends PrimeSubsequence {

  private Z mP = Z.ONE;

  /** Construct the sequence. */
  public A181516() {
    super(new A011371());
  }

  @Override
  public Z next() {
    while (true) {
      Z result = super.next();
      if (!result.equals(mP)) {
        mP = result;
        return result;
      }
    }
  }
}
