package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078012 Expansion of <code>(1 - x) / (1 - x - x^3)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A078012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078012() {
    super(new long[] {1, 0, 1}, new long[] {1, 0, 0});
  }
}
