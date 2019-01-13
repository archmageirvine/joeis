package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146512.
 * @author Sean A. Irvine
 */
public class A146512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146512() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 13});
  }
}
