package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020459;

/**
 * A036312 Composite numbers whose prime factors contain no digits other than 2 and 7.
 * @author Sean A. Irvine
 */
public class A036312 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020459();
  }
}
