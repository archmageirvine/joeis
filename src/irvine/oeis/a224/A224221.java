package irvine.oeis.a224;

import irvine.oeis.FiniteSequence;

/**
 * A224221 a(0)=3; for n&gt;0, a(n) is the smallest odd prime q not already in the sequence such that the n-th prime p(n) divides a(n-1)+q. If no such prime q exists, the sequence terminates.
 * @author Georg Fischer
 */
public class A224221 extends FiniteSequence {

  /** Construct the sequence. */
  public A224221() {
    super(3, 5, 7, 13, 29, 37, 41, 61, 53, 131, 43, 19, 277, 379, 137, 239, 79, 157, 331, 71);
  }
}
