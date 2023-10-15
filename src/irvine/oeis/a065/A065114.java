package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a010.A010340;

/**
 * A065114 Sum of terms in the period of continued fraction for sqrt(n) (A010340) is a square.
 * @author Sean A. Irvine
 */
public class A065114 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065114() {
    super(1, 1, new A010340(), k -> !k.isZero() && k.isSquare());
  }
}
