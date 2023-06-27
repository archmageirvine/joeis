package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046718 Number of permutations of [ n ] with exactly one 132-pattern and two 123-patterns.
 * @author Sean A. Irvine
 */
public class A046718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046718() {
    super(4, new long[] {-16, 32, -24, 8}, new long[] {1, 4, 14, 47});
  }
}
