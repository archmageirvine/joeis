package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016135 Expansion of <code>1/((1-2*x)*(1-11*x))</code>.
 * @author Sean A. Irvine
 */
public class A016135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016135() {
    super(new long[] {-22, 13}, new long[] {1, 13});
  }
}
