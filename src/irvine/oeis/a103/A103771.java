package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103771 Expansion of <code>1/(1-4x-4x^2-4x^3)</code>.
 * @author Sean A. Irvine
 */
public class A103771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103771() {
    super(new long[] {4, 4, 4}, new long[] {1, 4, 20});
  }
}
