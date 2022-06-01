package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007572 Generalization of the golden ratio (expansion of (5-13x)/((1+x)(1-4x))).
 * @author Sean A. Irvine
 */
public class A007572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007572() {
    super(new long[] {4, 3}, new long[] {5, 2});
  }
}

