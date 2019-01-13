package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047219.
 * @author Sean A. Irvine
 */
public class A047219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047219() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 6});
  }
}
