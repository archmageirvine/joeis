package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113804.
 * @author Sean A. Irvine
 */
public class A113804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113804() {
    super(new long[] {-1, 1, 1}, new long[] {4, 10, 18});
  }
}
