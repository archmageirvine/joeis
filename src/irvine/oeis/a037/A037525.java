package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037525.
 * @author Sean A. Irvine
 */
public class A037525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037525() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 17, 136, 1090});
  }
}
