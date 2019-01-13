package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081015.
 * @author Sean A. Irvine
 */
public class A081015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081015() {
    super(new long[] {1, -8, 8}, new long[] {5, 30, 200});
  }
}
