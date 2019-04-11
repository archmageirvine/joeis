package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041629 Denominators of continued fraction convergents to <code>sqrt(333)</code>.
 * @author Sean A. Irvine
 */
public class A041629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041629() {
    super(new long[] {-1, 0, 146, 0}, new long[] {1, 4, 145, 584});
  }
}
