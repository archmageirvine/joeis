package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157810 Period 4: repeat <code>[2, 1, 3, 2]</code>.
 * @author Sean A. Irvine
 */
public class A157810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157810() {
    super(new long[] {1, 0, 0, 0}, new long[] {2, 1, 3, 2});
  }
}
