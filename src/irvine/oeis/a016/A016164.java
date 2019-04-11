package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016164 Expansion of <code>1/((1-5x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016164() {
    super(new long[] {-50, 15}, new long[] {1, 15});
  }
}
