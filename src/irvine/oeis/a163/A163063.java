package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163063.
 * @author Sean A. Irvine
 */
public class A163063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163063() {
    super(new long[] {1, 4}, new long[] {3, 11});
  }
}
