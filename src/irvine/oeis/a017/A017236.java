package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017236 <code>a(n) = (9*n + 6)^4</code>.
 * @author Sean A. Irvine
 */
public class A017236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017236() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1296, 50625, 331776, 1185921, 3111696});
  }
}
