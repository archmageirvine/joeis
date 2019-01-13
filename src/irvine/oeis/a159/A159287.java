package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159287.
 * @author Sean A. Irvine
 */
public class A159287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159287() {
    super(new long[] {2, 1, 0}, new long[] {0, 0, 1});
  }
}
