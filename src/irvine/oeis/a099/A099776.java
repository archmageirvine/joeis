package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099776 Length of the hypotenuse of <code>an</code> integer right triangle with the hypotenuse being one more than the longer side. The shorter sides are just consecutive odd numbers <code>3, 5, 7, </code>...
 * @author Sean A. Irvine
 */
public class A099776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099776() {
    super(new long[] {1, -3, 3}, new long[] {5, 13, 25});
  }
}
