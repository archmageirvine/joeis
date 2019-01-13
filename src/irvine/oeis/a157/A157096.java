package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157096.
 * @author Sean A. Irvine
 */
public class A157096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157096() {
    super(new long[] {1, -23, 23}, new long[] {0, 55, 1260});
  }
}
