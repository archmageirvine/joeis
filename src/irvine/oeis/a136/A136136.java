package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136136 <code>a(n+1)=sopfr(2a(n)+1)</code>, with <code>sopfr=A001414</code>. Finishes with <code>10 (fixed point)</code>.
 * @author Georg Fischer
 */
public class A136136 extends FiniteSequence {

  /** Construct the sequence. */
  public A136136() {
    super(1, 3, 7, 8, 17, 12, 10);
  }
}
