package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016201 Expansion of g.f. 1/((1-x)*(1-2*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A016201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016201() {
    super(new long[] {14, -23, 10}, new long[] {1, 10, 77});
  }
}
