package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016801 Expansion of <code>1/((1-3x)(1-4x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A016801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016801() {
    super(new long[] {84, -61, 14}, new long[] {1, 14, 135});
  }
}
