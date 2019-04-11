package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016285 Expansion of <code>1/((1-2x)(1-4x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A016285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016285() {
    super(new long[] {56, -50, 13}, new long[] {1, 13, 119});
  }
}
