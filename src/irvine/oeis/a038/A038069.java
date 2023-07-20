package irvine.oeis.a038;
// manually 2020-12-30

import irvine.oeis.memory.MemorySequence;

/**
 * A038069 Product_{k&gt;=1} ((1 + x^k)^a(k)) = 1 + 4x.
 * Dirichlet convolution of A038065 with the characteristic function of powers of 2 (A209229).
 * @author Georg Fischer
 */
public class A038069 extends A038067 {

  /** Construct the sequence. */
  public A038069() {
    mSeq = MemorySequence.cachedSequence(new A038065());
  }

}
