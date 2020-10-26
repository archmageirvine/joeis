package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020467;

/**
 * A036320 Composite numbers n such that digits of prime factors of n are either 5 or 7.
 * @author Sean A. Irvine
 */
public class A036320 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020467();
  }
}
