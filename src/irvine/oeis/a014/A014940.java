package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014940 a(1)=1, a(n)=n*22^(n-1)+a(n-1).
 * @author Sean A. Irvine
 */
public class A014940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014940() {
    super(new long[] {484, -528, 45}, new long[] {1, 45, 1497});
  }
}
