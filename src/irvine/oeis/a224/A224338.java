package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224338 Number of idempotent 7X7 <code>0..n</code> matrices of rank 6.
 * @author Sean A. Irvine
 */
public class A224338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224338() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {889, 10199, 57337, 218743, 653177, 1647079, 3670009});
  }
}
