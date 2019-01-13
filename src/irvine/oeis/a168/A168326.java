package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168326.
 * @author Sean A. Irvine
 */
public class A168326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168326() {
    super(new long[] {-1, 1, 1}, new long[] {4, 4, 10});
  }
}
