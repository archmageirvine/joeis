package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168300.
 * @author Sean A. Irvine
 */
public class A168300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168300() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 11});
  }
}
