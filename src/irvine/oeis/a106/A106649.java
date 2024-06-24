package irvine.oeis.a106;
// manually 2024-06-22

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A106649 a(n) = if n&lt;10 then n else 2*a(floor(n/2)) + 9 - n mod 10.
 * @author Georg Fischer
 */
public class A106649 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A106649() {
    super(0, (self, n) -> (n < 10) ? Z.valueOf(n) : self.a(n / 10).multiply(10).add(9).subtract(n % 10), "");
  }
}
