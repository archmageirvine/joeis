package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098602 a(n) = A001652(n) * A046090(n).
 * @author Sean A. Irvine
 */
public class A098602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098602() {
    super(new long[] {1, -35, 35}, new long[] {0, 12, 420});
  }
}
