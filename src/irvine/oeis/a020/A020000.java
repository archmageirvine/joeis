package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020000 Expansion of 1/((1-5*x)*(1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A020000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020000() {
    super(new long[] {385, -167, 23}, new long[] {1, 23, 362});
  }
}
