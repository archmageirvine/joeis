package irvine.oeis.a069;

import irvine.oeis.a000.A000217;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069558 extends A069556 {

  /** Construct the sequence. */
  public A069558() {
    super(new A000217().skip());
  }
}
