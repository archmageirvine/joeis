package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106202 Expansion of Im(x/(1 <code>- x -</code> 2*i*x^2)), i=sqrt(-1).
 * @author Sean A. Irvine
 */
public class A106202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106202() {
    super(new long[] {-4, 0, -1, 2}, new long[] {0, 0, 0, 2});
  }
}
