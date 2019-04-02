package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041827 Denominators of continued fraction convergents to sqrt(434).
 * @author Sean A. Irvine
 */
public class A041827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041827() {
    super(new long[] {-1, 0, 0, 0, 250, 0, 0, 0}, new long[] {1, 1, 5, 6, 245, 251, 1249, 1500});
  }
}
