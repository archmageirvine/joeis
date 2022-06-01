package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103685 Consider the morphism 1-&gt;{1,2}, 2-&gt;{1,3}, 3-&gt;{1}; a(n) is the total number of '3' after n substitutions.
 * @author Sean A. Irvine
 */
public class A103685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103685() {
    super(new long[] {-2, 6, -8, 5}, new long[] {0, 0, 1, 5});
  }
}
