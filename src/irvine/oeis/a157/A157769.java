package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157769 <code>8984250n - 6468330</code>.
 * @author Sean A. Irvine
 */
public class A157769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157769() {
    super(new long[] {-1, 2}, new long[] {2515920, 11500170});
  }
}
