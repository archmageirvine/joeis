package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016276 Expansion of <code>1/((1-2x)(1-3x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A016276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016276() {
    super(new long[] {42, -41, 12}, new long[] {1, 12, 103});
  }
}
