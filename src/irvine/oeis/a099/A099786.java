package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099786.
 * @author Sean A. Irvine
 */
public class A099786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099786() {
    super(new long[] {1, 27, -27, 9}, new long[] {1, 3, 9, 27});
  }
}
