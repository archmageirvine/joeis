package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020470;

/**
 * A036323 Composite numbers whose prime factors contain no digits other than 7 and 8.
 * @author Sean A. Irvine
 */
public class A036323 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020470();
  }
}
