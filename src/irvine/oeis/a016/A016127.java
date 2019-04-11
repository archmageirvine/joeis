package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016127 Expansion of <code>1/((1-2*x)*(1-5*x))</code>.
 * @author Sean A. Irvine
 */
public class A016127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016127() {
    super(new long[] {-10, 7}, new long[] {1, 7});
  }
}
