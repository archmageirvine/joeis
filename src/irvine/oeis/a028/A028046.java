package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028046 Expansion of <code>1/((1-3x)(1-4x)(1-8x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028046() {
    super(new long[] {-1152, 912, -248, 27}, new long[] {1, 27, 481, 7203});
  }
}
