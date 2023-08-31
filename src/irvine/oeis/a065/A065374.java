package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;

/**
 * A065374 Smallest k such that f(f(...f(k))) &gt; 1, where f(k) = A065371(k) is iterated n times.
 * @author Sean A. Irvine
 */
public class A065374 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065374() {
    super(1, new A065373().skip(), 2);
    next();
  }
}
