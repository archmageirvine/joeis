package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265379.
 * @author Sean A. Irvine
 */
public class A265379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265379() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 111, 11101, 1110011});
  }
}
