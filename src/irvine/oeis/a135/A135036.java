package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135036.
 * @author Sean A. Irvine
 */
public class A135036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135036() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 26, 68});
  }
}
