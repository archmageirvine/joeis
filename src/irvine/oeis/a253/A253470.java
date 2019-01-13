package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253470.
 * @author Sean A. Irvine
 */
public class A253470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253470() {
    super(new long[] {1, -9, 9}, new long[] {1, 5, 36});
  }
}
