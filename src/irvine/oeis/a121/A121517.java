package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121517.
 * @author Sean A. Irvine
 */
public class A121517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121517() {
    super(new long[] {-1, 4, 4}, new long[] {1, 1, 7});
  }
}
