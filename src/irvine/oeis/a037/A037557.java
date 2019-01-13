package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037557.
 * @author Sean A. Irvine
 */
public class A037557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037557() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 17, 137, 1098});
  }
}
