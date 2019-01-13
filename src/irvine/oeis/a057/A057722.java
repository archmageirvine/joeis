package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057722.
 * @author Sean A. Irvine
 */
public class A057722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057722() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, -1, 5, 55, 209});
  }
}
