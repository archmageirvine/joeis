package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022454 Expansion of <code>1/((1-x)*(1-5*x)*(1-7*x)*(1-10*x))</code>.
 * @author Sean A. Irvine
 */
public class A022454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022454() {
    super(new long[] {-350, 505, -177, 23}, new long[] {1, 23, 352, 4530});
  }
}
