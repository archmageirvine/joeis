package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a080.A080764;

/**
 * A395101 Indices k such that A080764(k) = 1.
 * @author Sean A. Irvine
 */
public class A395101 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395101() {
    super(1, 0, new A080764(), ONE);
  }
}
