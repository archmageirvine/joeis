package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020969 Expansion of 1/((1-7*x)*(1-8*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020969() {
    super(new long[] {672, -236, 27}, new long[] {1, 27, 493});
  }
}
