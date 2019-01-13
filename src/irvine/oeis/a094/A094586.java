package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094586.
 * @author Sean A. Irvine
 */
public class A094586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094586() {
    super(new long[] {1, -2, -3, 4}, new long[] {1, 5, 16, 47});
  }
}
