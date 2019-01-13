package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063216.
 * @author Sean A. Irvine
 */
public class A063216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063216() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 8, 14, 22, 28});
  }
}
