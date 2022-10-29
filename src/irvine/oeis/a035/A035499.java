package irvine.oeis.a035;

import irvine.oeis.FilterPositionSequence;

/**
 * A035499 Turns at which card 1 surfaces in Guy's shuffling problem (A035485).
 * @author Sean A. Irvine
 */
public class A035499 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A035499() {
    super(0, new A035492(), 1);
  }
}

