package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016322 Expansion of <code>1/((1-2x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016322() {
    super(new long[] {198, -139, 22}, new long[] {1, 22, 345});
  }
}
