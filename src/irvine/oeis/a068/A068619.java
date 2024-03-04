package irvine.oeis.a068;

import irvine.oeis.a000.A000217;

/**
 * A068619 a(1) = 3; a(n+1) = smallest triangular number formed by inserting one or more digits into a(n).
 * @author Sean A. Irvine
 */
public class A068619 extends A068618 {

  /** Construct the sequence. */
  public A068619() {
    super(new A000217().skip(2));
  }
}
