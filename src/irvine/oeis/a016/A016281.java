package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016281 Expansion of g.f. 1/((1-2*x)*(1-3*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016281() {
    super(new long[] {72, -66, 17}, new long[] {1, 17, 223});
  }
}
