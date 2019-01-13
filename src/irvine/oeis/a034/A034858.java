package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034858.
 * @author Sean A. Irvine
 */
public class A034858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034858() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {7, 38, 93, 180, 308});
  }
}
