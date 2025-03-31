package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020579 Expansion of g.f. 1/((1-6*x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A020579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020579() {
    super(new long[] {432, -174, 23}, new long[] {1, 23, 355});
  }
}
