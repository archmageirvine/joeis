package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057174.
 * @author Sean A. Irvine
 */
public class A057174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057174() {
    super(new long[] {1, 1, -1}, new long[] {1, 2, 3});
  }
}
