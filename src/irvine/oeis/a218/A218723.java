package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218723 a(n) = (256^n - 1)/255.
 * @author Sean A. Irvine
 */
public class A218723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218723() {
    super(new long[] {-256, 257}, new long[] {0, 1});
  }
}
