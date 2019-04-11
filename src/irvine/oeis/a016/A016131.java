package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016131 Expansion of <code>1/((1-2x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A016131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016131() {
    super(new long[] {-16, 10}, new long[] {1, 10});
  }
}
