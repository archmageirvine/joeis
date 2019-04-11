package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073475 Rearrangement of factorial numbers such that a(k) + a(k+1) <code>- 1</code> is a prime for all k.
 * @author Georg Fischer
 */
public class A073475 extends FiniteSequence {

  /** Construct the sequence. */
  public A073475() {
    super(1, 2, 6, 24, 720, 120);
  }
}
