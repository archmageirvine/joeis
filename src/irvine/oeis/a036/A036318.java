package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020465;

/**
 * A036318 Composite numbers n such that digits of prime factors of n are either 4 or 7.
 * @author Sean A. Irvine
 */
public class A036318 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020465();
  }
}
