package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016109 Expansion of 1/((1-7*x)*(1-8*x)*(1-9*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016109() {
    super(new long[] {-5040, 2414, -431, 34}, new long[] {1, 34, 725, 12410});
  }
}
