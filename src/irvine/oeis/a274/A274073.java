package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274073 a(n) = 6^n-(-1)^n.
 * @author Sean A. Irvine
 */
public class A274073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274073() {
    super(new long[] {6, 5}, new long[] {0, 7});
  }
}
