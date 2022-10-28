package irvine.oeis.a047;

import irvine.oeis.FilterPositionSequence;

/**
 * A047984 Integers n such that A047988(n)=1.
 *
 * @author Sean A. Irvine
 */
public class A047984 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A047984() {
    super(2, new A047988(), 1);
  }
}
