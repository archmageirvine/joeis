package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022725 Expansion of 1/((1-x)*(1-5*x)*(1-8*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A022725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022725() {
    super(new long[] {-480, 676, -221, 26}, new long[] {1, 26, 455, 6760});
  }
}
