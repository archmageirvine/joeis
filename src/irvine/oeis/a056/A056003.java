package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056003 a(n) = (n+1)*binomial(n+8, 8).
 * @author Sean A. Irvine
 */
public class A056003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056003() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 18, 135, 660, 2475, 7722, 21021, 51480, 115830, 243100});
  }
}
