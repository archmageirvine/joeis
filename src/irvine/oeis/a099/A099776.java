package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099776 Length of the hypotenuse of an integer right triangle with the hypotenuse being one more than the longer side. The shorter sides are just consecutive odd numbers 3, 5, 7, ...
 * @author Sean A. Irvine
 */
public class A099776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099776() {
    super(1, new long[] {1, -3, 3}, new long[] {5, 13, 25});
  }
}
