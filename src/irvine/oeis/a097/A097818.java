package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097818 Expansion of <code>(8+10x)/((1-x)(1-100x))</code>.
 * @author Sean A. Irvine
 */
public class A097818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097818() {
    super(new long[] {-100, 101}, new long[] {8, 818});
  }
}
