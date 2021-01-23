package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246036 Expansion of (1+4*x)/((1+2*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A246036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246036() {
    super(new long[] {8, 2}, new long[] {1, 6});
  }
}
