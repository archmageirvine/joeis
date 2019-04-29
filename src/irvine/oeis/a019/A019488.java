package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019488 Expansion of <code>1/((1-4*x)*(1-6*x)*(1-11*x))</code>.
 * @author Sean A. Irvine
 */
public class A019488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019488() {
    super(new long[] {264, -134, 21}, new long[] {1, 21, 307});
  }
}
