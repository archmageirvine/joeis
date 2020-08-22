package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017308 a(n) = (10*n + 3)^4.
 * @author Sean A. Irvine
 */
public class A017308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017308() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 28561, 279841, 1185921, 3418801});
  }
}
