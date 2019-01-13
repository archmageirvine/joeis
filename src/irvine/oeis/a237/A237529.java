package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237529.
 * @author Sean A. Irvine
 */
public class A237529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237529() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6, 156, 1191, 5565, 19620, 57351, 146391, 336951, 714555});
  }
}
