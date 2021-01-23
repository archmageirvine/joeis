package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020471;

/**
 * A036324 Composite numbers n such that digits of prime factors of n are either 7 or 9 or both.
 * @author Sean A. Irvine
 */
public class A036324 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020471();
  }
}
