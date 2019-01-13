package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057083.
 * @author Sean A. Irvine
 */
public class A057083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057083() {
    super(new long[] {-3, 3}, new long[] {1, 3});
  }
}
