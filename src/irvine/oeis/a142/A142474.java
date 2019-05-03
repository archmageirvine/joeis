package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142474 1 followed by <code>A141015</code>.
 * @author Sean A. Irvine
 */
public class A142474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142474() {
    super(new long[] {1, 2, 1}, new long[] {1, 0, 1});
  }
}
