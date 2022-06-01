package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182466 a(n) = 3a(n-1) - 2a(n-2) with a(0)=32 and a(1)=80.
 * @author Sean A. Irvine
 */
public class A182466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182466() {
    super(new long[] {-2, 3}, new long[] {32, 80});
  }
}
