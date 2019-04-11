package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016317 Expansion of <code>1/((1-2x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016317() {
    super(new long[] {160, -116, 20}, new long[] {1, 20, 284});
  }
}
