package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025931.
 * @author Sean A. Irvine
 */
public class A025931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025931() {
    super(new long[] {-210, 247, -101, 17}, new long[] {1, 17, 188, 1726});
  }
}
