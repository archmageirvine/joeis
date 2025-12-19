package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;

/**
 * A082664 Numbers k such that A082647(k) = A000005(k) - 1.
 * @author Sean A. Irvine
 */
public class A082664 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082664() {
    super(1, 1, new A082647(), (n, k) -> Functions.SIGMA0.z(n).subtract(1).equals(k));
  }
}
