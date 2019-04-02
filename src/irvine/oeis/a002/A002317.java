package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002317 Related to Genocchi numbers.
 * @author Sean A. Irvine
 */
public class A002317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002317() {
    super(new long[] {-1, -6, -11, 6}, new long[] {2, 5, 7, -26});
  }
}
