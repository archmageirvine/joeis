package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020464;

/**
 * A036317 Composite numbers n such that digits of prime factors of n are either 3 or 8.
 * @author Sean A. Irvine
 */
public class A036317 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020464();
  }
}
