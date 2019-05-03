package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099269 A sequence derived from a matrix using <code>"0,1,2,3,4,5,6"</code>.
 * @author Sean A. Irvine
 */
public class A099269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099269() {
    super(new long[] {-18, 4, 7}, new long[] {1, 4, 32});
  }
}
