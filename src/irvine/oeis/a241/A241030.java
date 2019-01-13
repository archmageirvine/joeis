package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241030.
 * @author Sean A. Irvine
 */
public class A241030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241030() {
    super(new long[] {-676, 1092, -457, 42}, new long[] {4, 42, 850, 19782});
  }
}
