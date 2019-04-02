package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041633 Denominators of continued fraction convergents to sqrt(335).
 * @author Sean A. Irvine
 */
public class A041633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041633() {
    super(new long[] {-1, 0, 0, 0, 1208, 0, 0, 0}, new long[] {1, 3, 10, 33, 1198, 3627, 12079, 39864});
  }
}
