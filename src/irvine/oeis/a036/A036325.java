package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020472;

/**
 * A036325 Composite numbers whose prime factors have no digits other than 8 and 9.
 * @author Sean A. Irvine
 */
public class A036325 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020472();
  }
}
