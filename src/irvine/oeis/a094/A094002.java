package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094002.
 * @author Sean A. Irvine
 */
public class A094002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094002() {
    super(new long[] {2, -5, 4}, new long[] {1, 5, 14});
  }
}
