package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123167.
 * @author Sean A. Irvine
 */
public class A123167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123167() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 3, 10, 7});
  }
}
