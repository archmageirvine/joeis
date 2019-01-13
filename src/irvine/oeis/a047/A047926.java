package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047926.
 * @author Sean A. Irvine
 */
public class A047926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047926() {
    super(new long[] {3, -7, 5}, new long[] {1, 3, 8});
  }
}
