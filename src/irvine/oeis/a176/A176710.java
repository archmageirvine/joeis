package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176710 Mix <code>A001021, 2*A001021</code>.
 * @author Sean A. Irvine
 */
public class A176710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176710() {
    super(new long[] {12, 0}, new long[] {1, 2});
  }
}
