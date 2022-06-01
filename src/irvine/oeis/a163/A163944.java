package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163944 Fourth left hand column of triangle A163940.
 * @author Sean A. Irvine
 */
public class A163944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163944() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4, 49, 246, 834, 2250, 5214});
  }
}
