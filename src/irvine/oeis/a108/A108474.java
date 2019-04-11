package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108474 Expansion of <code>1/(1-2x)(1+4x^2))</code>.
 * @author Sean A. Irvine
 */
public class A108474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108474() {
    super(new long[] {8, -4, 2}, new long[] {1, 2, 0});
  }
}
