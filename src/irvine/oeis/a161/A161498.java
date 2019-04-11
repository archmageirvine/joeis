package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161498 Expansion of <code>x*(1-x)*(1+x)/(1-13*x+36*x^2-13*x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A161498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161498() {
    super(new long[] {-1, 13, -36, 13}, new long[] {1, 13, 132, 1261});
  }
}
