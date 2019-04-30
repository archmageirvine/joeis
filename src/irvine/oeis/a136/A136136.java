package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136136 <code>a(n+1)=sopfr(2a(n)+1)</code>, with sopfr=A001414. Finishes with 10 (fixed point).
 * @author Georg Fischer
 */
public class A136136 extends FiniteSequence {

  /** Construct the sequence. */
  public A136136() {
    super(1, 3, 7, 8, 17, 12, 10);
  }
}
