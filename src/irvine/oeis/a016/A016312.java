package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016312 Expansion of g.f. 1/((1 - 2*x)*(1 - 7*x)*(1 - 9*x)).
 * @author Sean A. Irvine
 */
public class A016312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016312() {
    super(new long[] {126, -95, 18}, new long[] {1, 18, 229});
  }
}
