package irvine.oeis.a067;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a011.A011757;

/**
 * A067852 Numbers k that divide prime(k^2) - 1.
 * @author Sean A. Irvine
 */
public class A067852 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067852() {
    super(1, 1, new A011757(), (n, k) -> k.subtract(1).mod(n) == 0);
  }
}
