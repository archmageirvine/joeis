package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229031 Number of 5-colorings of the strong product of the complete graph K2 and the cycle graph Cn.
 * @author Sean A. Irvine
 */
public class A229031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229031() {
    super(new long[] {-48, 20, 4}, new long[] {120, 0, 2400});
  }
}
