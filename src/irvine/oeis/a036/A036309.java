package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020457;

/**
 * A036309 Composite numbers whose prime factors contain no digits other than 1 and 9.
 * @author Sean A. Irvine
 */
public class A036309 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020457();
  }
}
