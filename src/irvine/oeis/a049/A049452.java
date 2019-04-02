package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049452 Pentagonal numbers with even index.
 * @author Sean A. Irvine
 */
public class A049452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049452() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 22});
  }
}
