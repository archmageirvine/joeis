package irvine.oeis.a087;

import irvine.oeis.FiniteSequence;

/**
 * A087312 a(1) = 1; for n &gt; 1, a(n) is the smallest number == -1 (mod a(n-1)), greater than n, with the same prime signature as n.
 * @author Georg Fischer
 */
public class A087312 extends FiniteSequence {

  /** Construct the sequence. */
  public A087312() {
    super(1, 3, 5, 9, 17, 33, 131, 143055667L);
  }
}
