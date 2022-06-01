package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016299 Expansion of 1/((1-2*x)*(1-5*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016299() {
    super(new long[] {100, -80, 17}, new long[] {1, 17, 209});
  }
}
