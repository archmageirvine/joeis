package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020469;

/**
 * A036322 Composite numbers whose prime factors contain no digits other than 6 and 7.
 * @author Sean A. Irvine
 */
public class A036322 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020469();
  }
}
