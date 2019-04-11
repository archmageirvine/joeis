package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200864 Expansion of <code>1/((1+x)*(1-3*x)*(1-5*x))</code>.
 * @author Sean A. Irvine
 */
public class A200864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200864() {
    super(new long[] {-15, -7, 7}, new long[] {1, 7, 42});
  }
}
