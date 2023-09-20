package irvine.oeis.a101;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000073;

/**
 * A101757 Indices of semiprimes in A000073.
 * @author Sean A. Irvine
 */
public class A101757 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A101757() {
    super(1, 0, new A000073(), SEMIPRIME);
  }
}
