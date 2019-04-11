package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019333 Expansion of <code>1/((1-4x)(1-6x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A019333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019333() {
    super(new long[] {192, -104, 18}, new long[] {1, 18, 220});
  }
}
