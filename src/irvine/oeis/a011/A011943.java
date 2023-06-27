package irvine.oeis.a011;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A011943 Numbers k such that any group of k consecutive integers has integral standard deviation (viz. A011944(k)).
 * @author Sean A. Irvine
 */
public class A011943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011943() {
    super(1, new long[] {-1, 14}, new long[] {1, 7});
  }
}
