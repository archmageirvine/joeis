package irvine.oeis.a087;

import irvine.oeis.FilterPositionSequence;

/**
 * A087118 Numbers having exactly one maximal group of consecutive zeros in binary representation of n.
 * @author Sean A. Irvine
 */
public class A087118 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A087118() {
    super(1, 0, new A087116(), ONE);
  }
}
