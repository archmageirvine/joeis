package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099138 a(n) = 6^(n-1)*J(n), where J(n) = A001045(n).
 * @author Sean A. Irvine
 */
public class A099138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099138() {
    super(new long[] {72, 6}, new long[] {0, 1});
  }
}
