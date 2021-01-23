package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020458;

/**
 * A036310 Composite numbers n such that digits of prime factors of n are either 2 or 3.
 * @author Sean A. Irvine
 */
public class A036310 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020458();
  }
}
