package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081890 a(n) = 9^n-8^n-7^n-6^n+3*5^n.
 * @author Sean A. Irvine
 */
public class A081890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081890() {
    super(new long[] {15120, -11274, 3325, -485, 35}, new long[] {1, 3, 7, 33, 643});
  }
}
