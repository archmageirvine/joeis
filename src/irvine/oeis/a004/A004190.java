package irvine.oeis.a004;

import irvine.oeis.LinearRecurrence;

/**
 * A004190 Expansion of <code>1/(1 - 11*x + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A004190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004190() {
    super(new long[] {-1, 11}, new long[] {1, 11});
  }
}
