package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020461;

/**
 * A036314 Composite numbers whose prime factors contain no digits other than 3 and 4.
 * @author Sean A. Irvine
 */
public class A036314 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020461();
  }
}
