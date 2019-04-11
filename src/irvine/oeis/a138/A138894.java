package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138894 Expansion of <code>(1+x)/(1-10*x+9*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A138894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138894() {
    super(new long[] {-9, 10}, new long[] {1, 11});
  }
}
