package irvine.oeis.a076;

import irvine.oeis.FiniteSequence;

/**
 * A076122 a(1)=1, a(2)=2 and then n^2 times a(n) is the product of its neighbors.
 * @author Georg Fischer
 */
public class A076122 extends FiniteSequence {

  /** Construct the sequence. */
  public A076122() {
    super(1, 2, 8, 36, 72, 50, 25);
  }
}
