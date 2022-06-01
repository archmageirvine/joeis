package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136325 a(n) = 8*a(n-1)-a(n-2) with a(0)=0 and a(1)=3.
 * @author Sean A. Irvine
 */
public class A136325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136325() {
    super(new long[] {-1, 8}, new long[] {0, 3});
  }
}
