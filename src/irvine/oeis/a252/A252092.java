package irvine.oeis.a252;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A252092 Numbers n such that the sum of the octagonal numbers N(n), N(n+1) and N(n+2) is equal to the pentagonal number P(m) for some m.
 * @author Sean A. Irvine
 */
public class A252092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252092() {
    super(new long[] {1, -940899, 940899}, new long[] {36, 34503186, 32463979328256L});
  }
}
