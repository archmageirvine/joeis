package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252093 Numbers n such that the pentagonal number <code>P(n)</code> is equal to the sum of the octagonal numbers <code>N(m), N(m+1)</code> and <code>N(m+2)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252093() {
    super(new long[] {1, -940899, 940899}, new long[] {90, 84515202, 79520184374490L});
  }
}
