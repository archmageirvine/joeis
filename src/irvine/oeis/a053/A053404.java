package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053404 Expansion of <code>1/((1+3*x)*(1-4*x))</code>.
 * @author Sean A. Irvine
 */
public class A053404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053404() {
    super(new long[] {12, 1}, new long[] {1, 1});
  }
}
