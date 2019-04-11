package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041099 Denominators of continued fraction convergents to <code>sqrt(57)</code>.
 * @author Sean A. Irvine
 */
public class A041099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041099() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 302, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 11, 20, 291, 311, 602, 2719, 3321, 6040});
  }
}
