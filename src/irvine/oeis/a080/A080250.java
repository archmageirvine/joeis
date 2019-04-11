package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080250 Expansion of <code>1/((1-x)(1-4x)(1-10x)(1-20x))</code>.
 * @author Sean A. Irvine
 */
public class A080250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080250() {
    super(new long[] {-800, 1120, -354, 35}, new long[] {1, 35, 871, 19215});
  }
}
