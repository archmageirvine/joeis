package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026061.
 * @author Sean A. Irvine
 */
public class A026061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026061() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {22, 40, 63, 92, 127, 170, 220});
  }
}
