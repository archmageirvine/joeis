package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001923;

/**
 * A073825 Numbers n such that Sum_{k=1..n} k^k is prime.
 * @author Sean A. Irvine
 */
public class A073825 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073825() {
    super(1, 0, new A001923(), PRIME);
  }
}
