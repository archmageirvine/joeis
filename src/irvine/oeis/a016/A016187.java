package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016187 Expansion of <code>1/((1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016187() {
    super(new long[] {-88, 19}, new long[] {1, 19});
  }
}
