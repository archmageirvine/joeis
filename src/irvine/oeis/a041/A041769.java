package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041769 Denominators of continued fraction convergents to sqrt(405).
 * @author Sean A. Irvine
 */
public class A041769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041769() {
    super(new long[] {-1, 0, 322, 0}, new long[] {1, 8, 321, 2576});
  }
}
