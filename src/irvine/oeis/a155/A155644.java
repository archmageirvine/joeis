package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155644 11^n-5^n+1.
 * @author Sean A. Irvine
 */
public class A155644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155644() {
    super(new long[] {55, -71, 17}, new long[] {1, 7, 97});
  }
}
