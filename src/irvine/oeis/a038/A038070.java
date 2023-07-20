package irvine.oeis.a038;
// manually 2020-12-30

import irvine.oeis.memory.MemorySequence;

/**
 * A038070 Product_{k&gt;=1} (1+x^k)^a(k) = 1 + 5x.
 * Dirichlet convolution of A038066 with the characteristic function of powers of 2 (A209229).
 * @author Georg Fischer
 */
public class A038070 extends A038067 {

  /** Construct the sequence. */
  public A038070() {
    mSeq = MemorySequence.cachedSequence(new A038066());
  }

}
