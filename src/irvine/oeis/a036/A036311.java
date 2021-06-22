package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;

/**
 * A036311 Composite numbers whose prime factors contain no digits other than 2 and 5.
 * @author Sean A. Irvine
 */
public class A036311 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new FiniteSequence(2, 5);
  }
}
