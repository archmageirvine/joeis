package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159833.
 * @author Sean A. Irvine
 */
public class A159833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159833() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 19, 54, 124});
  }
}
