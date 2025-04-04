package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016198 Expansion of g.f. 1/((1-x)*(1-2*x)*(1-5*x)).
 * @author Sean A. Irvine
 */
public class A016198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016198() {
    super(new long[] {10, -17, 8}, new long[] {1, 8, 47});
  }
}
