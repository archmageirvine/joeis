package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020466;

/**
 * A036319 Composite numbers N such that digits of prime factors of N are either 4 or 9.
 * @author Sean A. Irvine
 */
public class A036319 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020466();
  }
}
