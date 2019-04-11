package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157626 <code>100n^2 - 151n + 57</code>.
 * @author Sean A. Irvine
 */
public class A157626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157626() {
    super(new long[] {1, -3, 3}, new long[] {6, 155, 504});
  }
}
