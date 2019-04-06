package irvine.oeis.a033;

import irvine.oeis.FiniteSequence;

/**
 * A033541 Number of irreducible exceptional curves of first kind on del Pezzo surface of degree 9-n.
 * @author Georg Fischer
 */
public class A033541 extends FiniteSequence {

  /** Construct the sequence. */
  public A033541() {
    super(0, 1, 3, 6, 10, 16, 27, 56, 240);
  }
}
