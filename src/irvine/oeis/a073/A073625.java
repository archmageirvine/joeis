package irvine.oeis.a073;

import irvine.oeis.a001.A001622;

/**
 * A073625 Primes ordered so that their most significant digits form the digits of golden ratio phi= 1.6180339887...
 * @author Sean A. Irvine
 */
public class A073625 extends A073622 {

  /** Construct the sequence. */
  public A073625() {
    super(new A001622());
  }
}
