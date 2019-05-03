package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118563 The set of numbers of the form <code>A003173(n)+1</code> with odd <code>A003173(n)</code> or of the form <code>2*(A003173(n)+1)</code> with even <code>A003173(n)</code>.
 * @author Georg Fischer
 */
public class A118563 extends FiniteSequence {

  /** Construct the sequence. */
  public A118563() {
    super(2, 4, 6, 8, 12, 20, 44, 68, 164);
  }
}
