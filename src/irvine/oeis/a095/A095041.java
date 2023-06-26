package irvine.oeis.a095;

import irvine.oeis.FiniteSequence;

/**
 * A095041 One of two (v,k,lambda)=(31,15,7) cyclic difference sets. The other one is A095042.
 * @author Georg Fischer
 */
public class A095041 extends FiniteSequence {

  /** Construct the sequence. */
  public A095041() {
    super(1, FINITE, 1, 2, 3, 4, 6, 8, 12, 15, 16, 17, 23, 24, 27, 29, 30);
  }
}
