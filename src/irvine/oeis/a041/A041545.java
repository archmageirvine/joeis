package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041545 Denominators of continued fraction convergents to sqrt(290).
 * @author Sean A. Irvine
 */
public class A041545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041545() {
    super(new long[] {1, 34}, new long[] {1, 34});
  }
}
