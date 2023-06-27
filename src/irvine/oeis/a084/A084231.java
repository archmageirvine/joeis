package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084231 Numbers k such that the root-mean-square value of 1, 2, ..., k, i.e., sqrt((1/k)*Sum_{j=1..k} j^2), is an integer.
 * @author Sean A. Irvine
 */
public class A084231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084231() {
    super(1, new long[] {1, -195, 195}, new long[] {1, 337, 65521});
  }
}
