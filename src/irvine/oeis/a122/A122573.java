package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122573 Expansion of <code>-x*(1+x)*(3*x^2-1) / ( 1-4*x^2+x^4 )</code>.
 * @author Sean A. Irvine
 */
public class A122573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122573() {
    super(new long[] {-1, 0, 4, 0}, new long[] {1, 1, 1, 1});
  }
}
