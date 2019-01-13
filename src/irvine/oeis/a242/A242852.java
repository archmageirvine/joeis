package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242852.
 * @author Sean A. Irvine
 */
public class A242852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242852() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 8, 10864, 235416, 1905632, 9409960, 34356048, 102213944});
  }
}
