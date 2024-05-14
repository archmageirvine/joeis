package irvine.oeis.a129;
// manually 2024-05-10/multrar at 2024-05-11 20:44

import irvine.math.cr.CR;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A129231 a(n) = floor(n*r) - a(n-1), where r = sqrt(2) and a(0) = 0.
 * @author Georg Fischer
 */
public class A129231 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A129231() {
    super(0, (self, n) -> CR.SQRT2.multiply(n).floor().subtract(self.a(n - 1)), "0");
  }
}
