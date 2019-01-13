package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121646.
 * @author Sean A. Irvine
 */
public class A121646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121646() {
    super(new long[] {-1, 2, 2}, new long[] {-1, 0, -3});
  }
}
