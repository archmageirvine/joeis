package irvine.oeis.a224;

import irvine.oeis.FiniteSequence;

/**
 * A224222 <code>a(0)=3</code>; for <code>n&gt;0, a(n)</code> is the smallest prime q not already in the sequence such that the n-th prime p(n) divides a(n-1)+q. If no such prime q exists, the sequence terminates.
 * @author Georg Fischer
 */
public class A224222 extends FiniteSequence {

  /** Construct the sequence. */
  public A224222() {
    super(3, 5, 7, 13, 29, 37, 2, 83, 31, 61, 113, 11, 137, 109, 149, 227, 197, 157, 331, 71);
  }
}
