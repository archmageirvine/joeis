package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020466;

/**
 * A036319 Composite numbers whose prime factors have no digits other than 4's and 9's.
 * @author Sean A. Irvine
 */
public class A036319 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020466();
  }
}
