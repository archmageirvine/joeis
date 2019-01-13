package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056326.
 * @author Sean A. Irvine
 */
public class A056326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056326() {
    super(new long[] {4, -6, 0, 3}, new long[] {0, 1, 2, 5});
  }
}
