package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159675 Expansion of <code>x*(1 + x)/(1 - 32*x + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A159675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159675() {
    super(new long[] {-1, 32}, new long[] {1, 33});
  }
}
