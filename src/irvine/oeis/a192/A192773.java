package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192773 Coefficient of x in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+2x+1.
 * @author Sean A. Irvine
 */
public class A192773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192773() {
    super(1, new long[] {1, 1, -5, -1, 5, 1}, new long[] {0, 1, 0, 4, 3, 18});
  }
}
