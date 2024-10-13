package irvine.oeis.a072;

import irvine.oeis.FilterSequence;

/**
 * A072596 Nonsquares with A072594(n) = 0.
 * @author Sean A. Irvine
 */
public class A072596 extends FilterSequence {

  /** Construct the sequence. */
  public A072596() {
    super(1, new A072595(), k -> !k.isSquare());
  }
}
