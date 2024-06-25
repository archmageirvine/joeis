package irvine.oeis.a115;
// manually 2024-06-22

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A115303 a(n) = n if n &lt; 3, otherwise 3*a(floor(n/3)) + 2 - n mod 3.
 * @author Georg Fischer
 */
public class A115303 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A115303() {
    super(1, (self, n) -> (n < 3) ? Z.valueOf(n) : self.a(n / 3).multiply(3).add(2).subtract(n % 3), "");
  }
}
