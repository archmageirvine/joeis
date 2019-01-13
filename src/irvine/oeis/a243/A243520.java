package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243520.
 * @author Sean A. Irvine
 */
public class A243520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243520() {
    super(new long[] {-1, 1, 1}, new long[] {0, 8, 11});
  }
}
