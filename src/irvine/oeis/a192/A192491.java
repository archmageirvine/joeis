package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192491.
 * @author Sean A. Irvine
 */
public class A192491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192491() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 240, 864, 2112});
  }
}
