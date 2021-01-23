package irvine.oeis.a024;

import irvine.oeis.Sequence;
import irvine.oeis.a007.A007528;

/**
 * A024944 Number of partitions of n into distinct 6k-1 primes.
 * @author Sean A. Irvine
 */
public class A024944 extends A024941 {

  @Override
  protected Sequence seq() {
    return new A007528();
  }

  {
    next();
  }
}
