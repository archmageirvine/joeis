package irvine.oeis.a090;

import irvine.oeis.DoubledSequence;
import irvine.oeis.a088.A088442;

/**
 * A090569 The survivor w(n,2) in a modified Josephus problem, with a step of 2.
 * @author Georg Fischer
 */
public class A090569 extends DoubledSequence {

  /** Construct the sequence. */
  public A090569() {
    super(1, new A088442());
  }
}
