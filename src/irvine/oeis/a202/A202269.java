package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202269 Right-truncatable triangular numbers: every prefix is triangular number.
 * @author Georg Fischer
 */
public class A202269 extends FiniteSequence {

  /** Construct the sequence. */
  public A202269() {
    super(1, 3, 6, 10, 15, 36, 66, 105, 153, 666);
  }
}
