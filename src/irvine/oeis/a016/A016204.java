package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016204 Expansion of 1/((1-x)*(1-2*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016204() {
    super(new long[] {18, -29, 12}, new long[] {1, 12, 115});
  }
}
