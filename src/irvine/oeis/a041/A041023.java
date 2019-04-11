package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041023 Denominators of continued fraction convergents to <code>sqrt(15)</code>.
 * @author Sean A. Irvine
 */
public class A041023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041023() {
    super(new long[] {-1, 0, 8, 0}, new long[] {1, 1, 7, 8});
  }
}
