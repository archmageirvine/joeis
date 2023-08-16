package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a010.A010340;

/**
 * A065112.
 * @author Sean A. Irvine
 */
public class A065114 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065114() {
    super(1, 1, new A010340(), k -> !k.isZero() && k.isSquare());
  }
}
