package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256226.
 * @author Sean A. Irvine
 */
public class A256226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256226() {
    super(new long[] {-1, 4, -5, 0, 5, -3, -3, 5, 0, -5, 4}, new long[] {0, 1, 11, 58, 199, 532, 1206, 2432, 4494, 7760, 12692});
  }
}
