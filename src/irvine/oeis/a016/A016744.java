package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016744.
 * @author Sean A. Irvine
 */
public class A016744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016744() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 16, 256, 1296, 4096});
  }
}
