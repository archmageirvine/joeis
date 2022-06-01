package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232015 Expansion of (1-2*x)/((1+2*x)*(1-3*x)).
 * @author Sean A. Irvine
 */
public class A232015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232015() {
    super(new long[] {6, 1}, new long[] {1, -1});
  }
}
