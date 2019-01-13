package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192981.
 * @author Sean A. Irvine
 */
public class A192981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192981() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 0, 2, 5});
  }
}
