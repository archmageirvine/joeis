package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135163.
 * @author Sean A. Irvine
 */
public class A135163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135163() {
    super(new long[] {-210, 247, -101, 17}, new long[] {0, 3, 29, 237});
  }
}
