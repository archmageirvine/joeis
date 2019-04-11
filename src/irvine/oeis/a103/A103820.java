package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103820 Whitney transform of <code>3^n</code>.
 * @author Sean A. Irvine
 */
public class A103820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103820() {
    super(new long[] {-3, 0, 4}, new long[] {1, 4, 16});
  }
}
