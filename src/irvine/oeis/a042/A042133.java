package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042133 Denominators of continued fraction convergents to sqrt(591).
 * @author Sean A. Irvine
 */
public class A042133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042133() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 331352, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 13, 16, 29, 219, 248, 467, 2116, 6815, 329236, 994523, 4307328, 5301851, 9609179, 72566104, 82175283, 154741387, 701140831, 2258163880L});
  }
}
