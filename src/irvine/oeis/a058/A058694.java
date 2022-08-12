package irvine.oeis.a058;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000041;

/**
 * A058694 Partial products p(0)*p(1)*...*p(n) of partition numbers A000041.
 * @author Sean A. Irvine
 */
public class A058694 extends PartialProductSequence {

  /** Construct the sequence. */
  public A058694() {
    super(new A000041());
  }
}
