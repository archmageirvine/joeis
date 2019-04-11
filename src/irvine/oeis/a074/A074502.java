package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074502 <code>1^n + 2^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074502() {
    super(new long[] {12, -20, 9}, new long[] {3, 9, 41});
  }
}
