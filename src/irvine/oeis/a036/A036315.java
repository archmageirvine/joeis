package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020462;

/**
 * A036315 Composite numbers n such that digits of prime factors of n are either 3 or 5.
 * @author Sean A. Irvine
 */
public class A036315 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020462();
  }
}
