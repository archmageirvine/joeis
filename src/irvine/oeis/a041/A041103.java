package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041103 Denominators of continued fraction convergents to sqrt(59).
 * @author Sean A. Irvine
 */
public class A041103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041103() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1060, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 22, 47, 69, 1013, 1082, 3177, 23321, 49819, 73140});
  }
}
