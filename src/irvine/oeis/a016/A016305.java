package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016305 Expansion of <code>1/((1-2*x)*(1-6*x)*(1-8*x))</code>.
 * @author Sean A. Irvine
 */
public class A016305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016305() {
    super(new long[] {96, -76, 16}, new long[] {1, 16, 180});
  }
}
