package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020593 Expansion of g.f. 1/((1 - 6*x)*(1 - 8*x)*(1 - 11*x)).
 * @author Sean A. Irvine
 */
public class A020593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020593() {
    super(new long[] {528, -202, 25}, new long[] {1, 25, 423});
  }
}
