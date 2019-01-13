package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037710.
 * @author Sean A. Irvine
 */
public class A037710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037710() {
    super(new long[] {-5, 6, -6, 6}, new long[] {1, 8, 42, 210});
  }
}
