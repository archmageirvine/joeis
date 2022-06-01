package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145978 Expansion of 1/(1-x*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A145978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145978() {
    super(new long[] {-8, 1}, new long[] {1, 1});
  }
}
