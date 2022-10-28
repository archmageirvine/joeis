package irvine.oeis.a047;

import irvine.oeis.FilterPositionSequence;

/**
 * A047987 Integers n such that A047988(n)=4.
 *
 * @author Sean A. Irvine
 */
public class A047987 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A047987() {
    super(2, new A047988(), 4);
  }
}
