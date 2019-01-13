package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080806.
 * @author Sean A. Irvine
 */
public class A080806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080806() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 3, 7, 29});
  }
}
