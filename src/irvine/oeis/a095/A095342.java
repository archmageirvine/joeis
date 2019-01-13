package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095342.
 * @author Sean A. Irvine
 */
public class A095342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095342() {
    super(new long[] {2, 3, 0}, new long[] {1, 1, 5});
  }
}
