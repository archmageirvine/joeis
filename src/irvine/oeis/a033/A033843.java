package irvine.oeis.a033;

import irvine.oeis.a007.A007508;

/**
 * A033843 Number of twin primes <code>&lt; 2^n</code>.
 * @author Sean A. Irvine
 */
public class A033843 extends A007508 {

  @Override
  protected long base() {
    return 2;
  }
}
