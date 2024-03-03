package irvine.oeis.a068;

import irvine.oeis.a000.A000217;

/**
 * A068590.
 * @author Sean A. Irvine
 */
public class A068619 extends A068618 {

  /** Construct the sequence. */
  public A068619() {
    super(new A000217().skip(2));
  }
}
