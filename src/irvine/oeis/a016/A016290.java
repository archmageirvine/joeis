package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016290 Expansion of g.f. 1/((1-2*x)*(1-4*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A016290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016290() {
    super(new long[] {64, -56, 14}, new long[] {1, 14, 140});
  }
}
