package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168199.
 * @author Sean A. Irvine
 */
public class A168199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168199() {
    super(new long[] {-1, 1, 1}, new long[] {2, 5, 5});
  }
}
