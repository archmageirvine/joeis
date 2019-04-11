package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052979 Expansion of <code>(1-x)(1+x)/(1-2*x-3*x^2+2*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052979() {
    super(new long[] {-2, 0, 3, 2}, new long[] {1, 2, 6, 18});
  }
}
