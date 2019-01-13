package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168378.
 * @author Sean A. Irvine
 */
public class A168378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168378() {
    super(new long[] {-1, 1, 1}, new long[] {3, 11, 11});
  }
}
