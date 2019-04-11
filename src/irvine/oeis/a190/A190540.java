package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190540 <code>7^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A190540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190540() {
    super(new long[] {-14, 9}, new long[] {0, 5});
  }
}
