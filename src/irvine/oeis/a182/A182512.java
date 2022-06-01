package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182512 a(n) = (16^n - 1)/5.
 * @author Sean A. Irvine
 */
public class A182512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182512() {
    super(new long[] {-16, 17}, new long[] {0, 3});
  }
}
