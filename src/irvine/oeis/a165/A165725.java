package irvine.oeis.a165;
// manually 2023-04-16

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A165725 Largest divisor of n coprime to 30. I.e., a(n) = max { k | gcd(n, k) = k and gcd(k, 30) = 1 }.
 * Multiplicative with a(p^e) = p^e if p >= 7 and 1 otherwise.
 * @author Georg Fischer
 */
public class A165725 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A165725() {
    super(1, (p, e) -> (p.compareTo(Z.SEVEN) >= 0) ? p.pow(e) : Z.ONE);
  }
}
