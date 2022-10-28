package irvine.oeis.a047;

import irvine.oeis.FilterPositionSequence;

/**
 * A047985 Integers n such that A047988(n)=2.
 *
 * @author Sean A. Irvine
 */
public class A047985 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A047985() {
    super(2, new A047988(), 2);
  }
}
