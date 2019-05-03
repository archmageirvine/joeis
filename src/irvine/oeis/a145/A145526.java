package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145526 Numbers Y such that <code>273*Y^2+91</code> is a square.
 * @author Sean A. Irvine
 */
public class A145526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145526() {
    super(new long[] {-1, 1454}, new long[] {11, 16005});
  }
}
