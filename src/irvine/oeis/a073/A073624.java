package irvine.oeis.a073;

import irvine.oeis.a001.A001620;

/**
 * A073624 Primes ordered so that their most significant digits form the digits of Euler-Mascheroni constant .5772156649...
 * @author Sean A. Irvine
 */
public class A073624 extends A073622 {

  /** Construct the sequence. */
  public A073624() {
    super(new A001620());
  }
}
