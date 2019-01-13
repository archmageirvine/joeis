package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121800.
 * @author Sean A. Irvine
 */
public class A121800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121800() {
    super(new long[] {56, 80, -60, -48, 18, 4}, new long[] {0, 159, 4694, 36506, 190224, 1152620});
  }
}
