package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168617.
 * @author Sean A. Irvine
 */
public class A168617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168617() {
    super(new long[] {2, -5, 4}, new long[] {0, 5, 17});
  }
}
