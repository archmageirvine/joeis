package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088095 <code>a(1) = 1, a(n) =</code> smallest number <code>== 1 mod (a(n-1))</code> and <code>&gt; 1</code> such that every concatenation <code>(n&gt;1)</code> is prime.
 * @author Georg Fischer
 */
public class A088095 extends FiniteSequence {

  /** Construct the sequence. */
  public A088095() {
    super(1, 3, 7, 29, 117, 1639, 45893, 734289, 54337387, 434699097L);
  }
}
