package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073608 <code>a(1) = 1, a(n) =</code> smallest number such that <code>a(n) -</code> a(n-k) is a prime power <code>&gt; 1</code> for all k.
 * @author Georg Fischer
 */
public class A073608 extends FiniteSequence {

  /** Construct the sequence. */
  public A073608() {
    super(1, 3, 5, 8, 10, 12);
  }
}
