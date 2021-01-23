package irvine.oeis.a038;
// manually 2020-12-30

import irvine.oeis.MemorySequence;

/**
 * A038068 Product_{k&gt;=1}(1 + x^k)^a(k) = 1 + 3x.
 * Dirichlet convolution of A038064 with the characteristic function of powers of 2 (A209229).
 * @author Georg Fischer
 */
public class A038068 extends A038067 {

  /** Construct the sequence */
  public A038068() {
    mSeq = MemorySequence.cachedSequence(new A038064());
  }

}
