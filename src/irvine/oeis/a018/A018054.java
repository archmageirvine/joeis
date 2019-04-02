package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018054 Expansion of 1/((1-3*x)*(1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A018054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018054() {
    super(new long[] {231, -131, 21}, new long[] {1, 21, 310});
  }
}
