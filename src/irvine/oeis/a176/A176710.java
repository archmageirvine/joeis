package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176710 Mix A001021, 2*A001021.
 * @author Sean A. Irvine
 */
public class A176710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176710() {
    super(new long[] {12, 0}, new long[] {1, 2});
  }
}
