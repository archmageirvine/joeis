package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091881.
 * @author Sean A. Irvine
 */
public class A091881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091881() {
    super(new long[] {-16, 17}, new long[] {1, 6});
  }
}
