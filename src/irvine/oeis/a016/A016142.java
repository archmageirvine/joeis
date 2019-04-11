package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016142 Expansion of <code>1/((1-3x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A016142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016142() {
    super(new long[] {-27, 12}, new long[] {1, 12});
  }
}
