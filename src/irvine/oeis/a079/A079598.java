package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079598 2^(4n+1)-2^(2n).
 * @author Sean A. Irvine
 */
public class A079598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079598() {
    super(new long[] {-64, 20}, new long[] {1, 28});
  }
}
