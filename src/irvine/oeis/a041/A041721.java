package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041721 Denominators of continued fraction convergents to sqrt(380).
 * @author Sean A. Irvine
 */
public class A041721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041721() {
    super(new long[] {-1, 0, 78, 0}, new long[] {1, 2, 77, 156});
  }
}
