package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020460;

/**
 * A036313 Composite numbers whose prime factors contain no digits other than 2 and 9.
 * @author Sean A. Irvine
 */
public class A036313 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020460();
  }
}
