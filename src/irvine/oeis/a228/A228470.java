package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228470.
 * @author Sean A. Irvine
 */
public class A228470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228470() {
    super(new long[] {1, 0, 6, 0}, new long[] {3, 11, 18, 68});
  }
}
