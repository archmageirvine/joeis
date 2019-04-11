package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016129 Expansion of <code>1/((1-2x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A016129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016129() {
    super(new long[] {-12, 8}, new long[] {1, 8});
  }
}
