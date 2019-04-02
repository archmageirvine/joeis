package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041237 Denominators of continued fraction convergents to sqrt(130).
 * @author Sean A. Irvine
 */
public class A041237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041237() {
    super(new long[] {1, 0, 0, 114, 0, 0}, new long[] {1, 2, 5, 112, 229, 570});
  }
}
