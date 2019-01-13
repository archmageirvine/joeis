package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037775.
 * @author Sean A. Irvine
 */
public class A037775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037775() {
    super(new long[] {-7, 8, -8, 8}, new long[] {3, 22, 154, 1080});
  }
}
