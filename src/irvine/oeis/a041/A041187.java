package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041187 Denominators of continued fraction convergents to <code>sqrt(104)</code>.
 * @author Sean A. Irvine
 */
public class A041187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041187() {
    super(new long[] {-1, 0, 102, 0}, new long[] {1, 5, 101, 510});
  }
}
