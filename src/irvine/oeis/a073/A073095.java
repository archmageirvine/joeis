package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008904;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073095 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073095() {
    super(1, 1, new A008904().skip(), (n, k) -> Binomial.binomial(2L * n, n).mod(10) == k.longValue());
  }
}
