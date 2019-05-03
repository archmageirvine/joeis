package irvine.oeis.a204;

import irvine.oeis.FiniteSequence;

/**
 * A204772 "Fairly optimal" shellsort sequence for reverse-sorting an ascending sequence of size <code>N=128</code>.
 * @author Georg Fischer
 */
public class A204772 extends FiniteSequence {

  /** Construct the sequence. */
  public A204772() {
    super(1, 4, 16, 76, 120, 127);
  }
}
