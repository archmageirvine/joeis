package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020468;

/**
 * A036321 Composite numbers n such that digits of prime factors of n are either 5 or 9.
 * @author Sean A. Irvine
 */
public class A036321 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020468();
  }
}
