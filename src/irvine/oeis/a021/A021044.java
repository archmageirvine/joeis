package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021044 Expansion of g.f. 1/((1 - x)*(1 - 2*x)*(1 - 3*x)*(1 - 8*x)).
 * @author Sean A. Irvine
 */
public class A021044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021044() {
    super(new long[] {-48, 94, -59, 14}, new long[] {1, 14, 137, 1186});
  }
}
