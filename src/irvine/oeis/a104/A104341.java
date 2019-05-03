package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104341 Numbers n such that <code>n -(digital</code> reversal of <code>n) = 9</code>.
 * @author Georg Fischer
 */
public class A104341 extends FiniteSequence {

  /** Construct the sequence. */
  public A104341() {
    super(10, 21, 32, 43, 54, 65, 76, 87, 98);
  }
}
