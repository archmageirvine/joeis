package irvine.oeis.a073;

import irvine.oeis.a002.A002193;

/**
 * A073626 Primes ordered so that their most significant digits form the digits of sqrt(2)=1.41421356237309504880...
 * @author Sean A. Irvine
 */
public class A073626 extends A073622 {

  /** Construct the sequence. */
  public A073626() {
    super(new A002193());
  }
}
