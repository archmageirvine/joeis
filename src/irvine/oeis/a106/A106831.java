package irvine.oeis.a106;
// manually 2025-04-01/multrar at 2025-04-06 22:03

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001511;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A106831 Define a triangle in which the entries are of the form +-1/(b!c!d!e!...), where the order of the factorials is important; read the triangle by rows and record and expand the denominators.
 * @author Georg Fischer
 */
public class A106831 extends MultiTransformSequence {

  private static final DirectSequence A001511 = new A001511();

  /** Construct the sequence. */
  public A106831() {
    super(0, (self, n) -> ((n & 1) == 0) ? A001511.a(n).add(1).multiply(self.a(n / 2)) : self.a(n / 2).multiply(2), "1");
    skip(1);
  }
}
