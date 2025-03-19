package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016183 Expansion of g.f. 1/((1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016183() {
    super(new long[] {-77, 18}, new long[] {1, 18});
  }
}
