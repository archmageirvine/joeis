package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091596.
 * @author Sean A. Irvine
 */
public class A091596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091596() {
    super(new long[] {-4, -4, 3, 2}, new long[] {0, 1, 2, 5});
  }
}
