package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020462;

/**
 * A036315 Composite numbers whose prime factors contain no digits other than 3 and 5.
 * @author Sean A. Irvine
 */
public class A036315 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020462();
  }
}
