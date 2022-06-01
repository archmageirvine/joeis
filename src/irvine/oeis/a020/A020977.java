package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020977 Expansion of 1/((1-8*x)*(1-9*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A020977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020977() {
    super(new long[] {792, -259, 28}, new long[] {1, 28, 525});
  }
}
