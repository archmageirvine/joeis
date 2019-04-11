package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016257 Expansion of <code>1/((1-x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016257() {
    super(new long[] {80, -98, 19}, new long[] {1, 19, 263});
  }
}
