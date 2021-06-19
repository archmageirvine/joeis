package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020471;

/**
 * A036324 Composite numbers whose prime factors have no digits other than 7's and 9's.
 * @author Sean A. Irvine
 */
public class A036324 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020471();
  }
}
