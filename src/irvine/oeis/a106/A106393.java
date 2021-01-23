package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106393 Expansion of 1/(1 - 8x + 17x^2).
 * @author Sean A. Irvine
 */
public class A106393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106393() {
    super(new long[] {-17, 8}, new long[] {1, 8});
  }
}
