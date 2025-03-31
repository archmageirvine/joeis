package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016181 Expansion of g.f. 1/((1-7*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016181() {
    super(new long[] {-70, 17}, new long[] {1, 17});
  }
}
