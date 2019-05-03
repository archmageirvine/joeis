package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070730 Euro coinage <code>(in cents)</code> from smallest physical size to largest.
 * @author Georg Fischer
 */
public class A070730 extends FiniteSequence {

  /** Construct the sequence. */
  public A070730() {
    super(1, 2, 10, 5, 20, 100, 50, 200);
  }
}
