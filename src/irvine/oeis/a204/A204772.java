package irvine.oeis.a204;

import irvine.oeis.FiniteSequence;

/**
 * A204772 &quot;Fairly optimal&quot; shellsort sequence for reverse-sorting an ascending sequence of size N=128.
 * @author Georg Fischer
 */
public class A204772 extends FiniteSequence {

  /** Construct the sequence. */
  public A204772() {
    super(1, 4, 16, 76, 120, 127);
  }
}
