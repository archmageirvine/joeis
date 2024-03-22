package irvine.oeis.a068;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A068882 Triangular numbers with property that digits alternate in parity.
 * @author Sean A. Irvine
 */
public class A068882 extends FilterSequence {

  /** Construct the sequence. */
  public A068882() {
    super(1, new A000217().skip(), A068880::is);
  }
}
