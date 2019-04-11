package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229702 Expansion of <code>1/((1-x)^4*(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A229702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229702() {
    super(new long[] {6, -25, 40, -30, 10}, new long[] {1, 10, 70, 440, 2675});
  }
}
