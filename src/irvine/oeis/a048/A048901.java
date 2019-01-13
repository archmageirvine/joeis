package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048901.
 * @author Sean A. Irvine
 */
public class A048901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048901() {
    super(new long[] {1, -323, 323}, new long[] {1, 247, 79453});
  }
}
