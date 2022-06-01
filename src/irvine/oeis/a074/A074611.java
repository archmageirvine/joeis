package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074611 4^n + 5^n.
 * @author Sean A. Irvine
 */
public class A074611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074611() {
    super(new long[] {-20, 9}, new long[] {2, 9});
  }
}
