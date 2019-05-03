package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099266 Partial sums of <code>A056273</code>.
 * @author Sean A. Irvine
 */
public class A099266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099266() {
    super(new long[] {-144, 468, -584, 355, -111, 17}, new long[] {1, 3, 8, 23, 75, 278});
  }
}
