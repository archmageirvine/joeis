package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094623 Expansion of <code>x*(1+10*x)/((1-x)*(1-10*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A094623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094623() {
    super(new long[] {-10, 10, 1}, new long[] {0, 1, 11});
  }
}
