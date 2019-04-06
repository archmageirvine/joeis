package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118563 The set of numbers of the form A003173(n)+1 with odd A003173(n) or of the form 2*(A003173(n)+1) with even A003173(n).
 * @author Georg Fischer
 */
public class A118563 extends FiniteSequence {

  /** Construct the sequence. */
  public A118563() {
    super(2, 4, 6, 8, 12, 20, 44, 68, 164);
  }
}
