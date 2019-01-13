package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048902.
 * @author Sean A. Irvine
 */
public class A048902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048902() {
    super(new long[] {1, -323, 323}, new long[] {1, 221, 71065});
  }
}
