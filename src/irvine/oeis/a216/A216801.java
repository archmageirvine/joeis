package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216801.
 * @author Sean A. Irvine
 */
public class A216801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216801() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {2, -22, -117, -468, -1755, -6513});
  }
}
