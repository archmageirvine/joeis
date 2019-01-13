package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277983.
 * @author Sean A. Irvine
 */
public class A277983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277983() {
    super(new long[] {1, -3, 3}, new long[] {36, 12, 96});
  }
}
