package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158609 Expansion of (1+8*x)/(1-x-81*x^2).
 * @author Sean A. Irvine
 */
public class A158609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158609() {
    super(new long[] {81, 1}, new long[] {1, 9});
  }
}
