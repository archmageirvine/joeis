package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020470;

/**
 * A036323 Composite numbers n such that digits of prime factors of n are either 7 or 8.
 * @author Sean A. Irvine
 */
public class A036323 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020470();
  }
}
