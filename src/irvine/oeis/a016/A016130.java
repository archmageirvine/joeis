package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016130 Expansion of g.f. 1/((1-2*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A016130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016130() {
    super(new long[] {-14, 9}, new long[] {1, 9});
  }
}
