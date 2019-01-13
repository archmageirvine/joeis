package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192879.
 * @author Sean A. Irvine
 */
public class A192879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192879() {
    super(new long[] {-1, 2, 2}, new long[] {0, 1, 4});
  }
}
