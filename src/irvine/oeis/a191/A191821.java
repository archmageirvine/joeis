package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191821.
 * @author Sean A. Irvine
 */
public class A191821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191821() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {2, 6, 26, 100, 332, 994});
  }
}
