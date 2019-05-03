package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162951 <code>a(1)=0. a(n)</code> is the smallest integer <code>&gt; a(n-1)</code> such that both <code>a(n)</code> and <code>a(n)-a(n-1)</code> have the same number of <code>1</code>'s when written in binary as n has when it is written in binary.
 * @author Georg Fischer
 */
public class A162951 extends FiniteSequence {

  /** Construct the sequence. */
  public A162951() {
    super(0, 1, 6, 8, 17, 20, 41);
  }
}
