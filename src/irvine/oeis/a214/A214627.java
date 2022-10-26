package irvine.oeis.a214;
// manually deris/primeval at 2022-10-26 11:22

import irvine.math.z.Z;
import irvine.oeis.a161.A161671;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A214627 Primes in A161671.
 * @author Georg Fischer
 */
public class A214627 extends PrimeSubsequence {

  private Z mP = Z.ONE;

  /** Construct the sequence. */
  public A214627() {
    super(new A161671());
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
