package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020982 Expansion of 1/((1-9*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A020982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020982() {
    super(new long[] {990, -299, 30}, new long[] {1, 30, 601});
  }
}
