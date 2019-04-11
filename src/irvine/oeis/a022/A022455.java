package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022455 Expansion of <code>1/((1-x)*(1-5*x)*(1-7*x)*(1-11*x))</code>.
 * @author Sean A. Irvine
 */
public class A022455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022455() {
    super(new long[] {-385, 552, -190, 24}, new long[] {1, 24, 386, 5256});
  }
}
