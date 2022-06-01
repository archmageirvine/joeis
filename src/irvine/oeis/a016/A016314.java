package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016314 Expansion of 1/((1-2x)*(1-7x)*(1-11x)).
 * @author Sean A. Irvine
 */
public class A016314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016314() {
    super(new long[] {154, -113, 20}, new long[] {1, 20, 287});
  }
}
