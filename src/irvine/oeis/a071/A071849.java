package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A071849 Numbers k such that A245788(k) &gt; prime(k).
 * @author Sean A. Irvine
 */
public class A071849 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071849() {
    super(1, 1, new A000040(), (n, p) -> n * Integer.bitCount(n) > p.longValueExact());
  }
}
