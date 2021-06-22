package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020458;

/**
 * A036310 Composite numbers whose prime factors contain no digits other than 2 and 3.
 * @author Sean A. Irvine
 */
public class A036310 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020458();
  }
}
