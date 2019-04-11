package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014236 G.f.: <code>2*x*(1-x)/((1-2*x)(1-2*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A014236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014236() {
    super(new long[] {-4, 2, 2}, new long[] {0, 2, 2});
  }
}
