package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016138 Expansion of 1/((1-3x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A016138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016138() {
    super(new long[] {-21, 10}, new long[] {1, 10});
  }
}
