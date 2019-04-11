package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176177 <code>a(n) = 2*n*3^(n-1) - (3^n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A176177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176177() {
    super(new long[] {9, -15, 7}, new long[] {0, 1, 8});
  }
}
