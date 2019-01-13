package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192979.
 * @author Sean A. Irvine
 */
public class A192979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192979() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 4, 9});
  }
}
