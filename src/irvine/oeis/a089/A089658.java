package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089658.
 * @author Sean A. Irvine
 */
public class A089658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089658() {
    super(new long[] {8, -12, 6}, new long[] {0, 2, 11});
  }
}
