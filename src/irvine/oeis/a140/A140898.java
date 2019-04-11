package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140898 Expansion of <code>-x^2/(136*x^2+2*x-1)</code>.
 * @author Sean A. Irvine
 */
public class A140898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140898() {
    super(new long[] {136, 2}, new long[] {0, 1});
  }
}
