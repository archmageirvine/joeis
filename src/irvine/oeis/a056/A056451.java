package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056451.
 * @author Sean A. Irvine
 */
public class A056451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056451() {
    super(new long[] {5, 0}, new long[] {1, 5});
  }
}
