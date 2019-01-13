package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081007.
 * @author Sean A. Irvine
 */
public class A081007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081007() {
    super(new long[] {1, -8, 8}, new long[] {0, 4, 33});
  }
}
