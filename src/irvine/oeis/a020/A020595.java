package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020595 Expansion of g.f. 1/((1-6*x)*(1-9*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A020595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020595() {
    super(new long[] {540, -204, 25}, new long[] {1, 25, 421});
  }
}
