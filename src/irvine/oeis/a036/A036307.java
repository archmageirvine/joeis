package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020455;

/**
 * A036307 Composite numbers n such that digits of prime factors of n are either 1 or 7.
 * @author Sean A. Irvine
 */
public class A036307 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020455();
  }
}
