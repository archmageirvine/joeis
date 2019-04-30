package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246645 Expansion of <code>1/(1 - 22*x + 81*x^2)</code>, used in A246643.
 * @author Sean A. Irvine
 */
public class A246645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246645() {
    super(new long[] {-81, 22}, new long[] {1, 22});
  }
}
