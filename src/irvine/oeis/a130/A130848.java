package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130848.
 * @author Sean A. Irvine
 */
public class A130848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130848() {
    super(new long[] {-1, 1}, new long[] {2, 5});
  }
}
