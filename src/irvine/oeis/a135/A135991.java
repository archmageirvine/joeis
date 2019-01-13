package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135991.
 * @author Sean A. Irvine
 */
public class A135991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135991() {
    super(new long[] {-1, 3, -3, 0, 0, 1}, new long[] {0, 0, 1, 0, -1, 0});
  }
}
