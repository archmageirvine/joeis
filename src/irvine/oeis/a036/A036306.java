package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020454;

/**
 * A036306 Composite numbers n such that digits of prime factors of n are either 1 or 6.
 * @author Sean A. Irvine
 */
public class A036306 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020454();
  }
}
