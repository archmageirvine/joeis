package irvine.oeis.a078;

import irvine.oeis.FilterPositionSequence;

/**
 * A078569 Numbers n such that A078568(n) is prime.
 * @author Sean A. Irvine
 */
public class A078569 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078569() {
    super(1, new A078568(), PRIME);
  }
}

