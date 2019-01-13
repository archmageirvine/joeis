package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080874.
 * @author Sean A. Irvine
 */
public class A080874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080874() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 3, 8});
  }
}
