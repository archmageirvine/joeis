package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155600 a(n) = 9^n-2^n+1^n.
 * @author Sean A. Irvine
 */
public class A155600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155600() {
    super(new long[] {18, -29, 12}, new long[] {1, 8, 78});
  }
}
