package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185787.
 * @author Sean A. Irvine
 */
public class A185787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185787() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 25, 62});
  }
}
