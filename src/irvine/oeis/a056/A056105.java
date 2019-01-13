package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056105.
 * @author Sean A. Irvine
 */
public class A056105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056105() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 9});
  }
}
