package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016315 Expansion of g.f. 1/((1 - 2*x)*(1 - 7*x)*(1 - 12*x)).
 * @author Sean A. Irvine
 */
public class A016315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016315() {
    super(new long[] {168, -122, 21}, new long[] {1, 21, 319});
  }
}
