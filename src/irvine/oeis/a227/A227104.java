package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227104 a(0)=-1, a(1)=3; a(n+2) = a(n+1) + a(n) + 2*A057078(n+1).
 * @author Sean A. Irvine
 */
public class A227104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227104() {
    super(new long[] {1, 2, 1, 0}, new long[] {-1, 3, 2, 3});
  }
}
