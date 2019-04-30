package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100335 An inverse Catalan transform of <code>J(2n)</code>.
 * @author Sean A. Irvine
 */
public class A100335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100335() {
    super(new long[] {-4, 8, -9, 5}, new long[] {0, 1, 4, 11});
  }
}
