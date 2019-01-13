package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099787.
 * @author Sean A. Irvine
 */
public class A099787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099787() {
    super(new long[] {2, 27, -27, 9}, new long[] {1, 3, 9, 27});
  }
}
