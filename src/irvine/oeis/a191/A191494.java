package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191494 Number of compositions of even natural numbers in 7 parts <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A191494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191494() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {1, 64, 1094, 8192, 39063, 139968, 411772, 1048576, 2391485});
  }
}
