package irvine.oeis.a224;

import irvine.oeis.FiniteSequence;

/**
 * A224221 <code>a(0)=3</code>; for <code>n&gt;0, a(n)</code> is the smallest odd prime q not already in the sequence such that the n-th prime <code>p(n)</code> divides <code>a(n-1)+q</code>. If no such prime q exists, the sequence terminates.
 * @author Georg Fischer
 */
public class A224221 extends FiniteSequence {

  /** Construct the sequence. */
  public A224221() {
    super(3, 5, 7, 13, 29, 37, 41, 61, 53, 131, 43, 19, 277, 379, 137, 239, 79, 157, 331, 71);
  }
}
