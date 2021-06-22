package irvine.oeis.a036;

import irvine.oeis.Sequence;
import irvine.oeis.a020.A020452;

/**
 * A036304 Composite numbers whose prime factors contain no digits other than 1 and 4.
 * @author Sean A. Irvine
 */
public class A036304 extends A036302 {

  @Override
  protected Sequence sourcePrimes() {
    return new A020452();
  }
}
