package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016296 Expansion of g.f. 1/((1 - 2*x)*(1 - 5*x)*(1 - 7*x)).
 * @author Sean A. Irvine
 */
public class A016296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016296() {
    super(new long[] {70, -59, 14}, new long[] {1, 14, 137});
  }
}
