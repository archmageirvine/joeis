package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015591 Expansion of <code>x/(1 - 10x - 9x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015591() {
    super(new long[] {9, 10}, new long[] {0, 1});
  }
}
