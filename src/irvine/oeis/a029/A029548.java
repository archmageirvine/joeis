package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029548 Expansion of <code>1/(1-32*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A029548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029548() {
    super(new long[] {-1, 32}, new long[] {1, 32});
  }
}
