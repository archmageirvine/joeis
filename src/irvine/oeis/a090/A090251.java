package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090251.
 * @author Sean A. Irvine
 */
public class A090251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090251() {
    super(new long[] {-1, 29}, new long[] {2, 29});
  }
}
