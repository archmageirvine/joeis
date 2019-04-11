package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218723 <code>a(n) = (256^n-1)/255</code>.
 * @author Sean A. Irvine
 */
public class A218723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218723() {
    super(new long[] {-256, 257}, new long[] {0, 1});
  }
}
