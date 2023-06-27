package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029858 a(n) = (3^n - 3)/2.
 * @author Sean A. Irvine
 */
public class A029858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029858() {
    super(1, new long[] {-3, 4}, new long[] {0, 3});
  }
}
