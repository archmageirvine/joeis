package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007572 Generalization of the golden ratio (expansion of <code>(5-13x)/((1+x)(1-4x)))</code>.
 * @author Sean A. Irvine
 */
public class A007572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007572() {
    super(new long[] {4, 3}, new long[] {5, 2});
  }
}

