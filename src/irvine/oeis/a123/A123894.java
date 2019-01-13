package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123894.
 * @author Sean A. Irvine
 */
public class A123894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123894() {
    super(new long[] {24, -24, 100, -50, 105, -35, 40, -10, 5}, new long[] {1, 5, 25, 115, 525, 2405, 11025, 50525, 231525});
  }
}
