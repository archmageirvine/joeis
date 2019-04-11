package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145978 Expansion of <code>1/(1-x*(1-8*x))</code>.
 * @author Sean A. Irvine
 */
public class A145978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145978() {
    super(new long[] {-8, 1}, new long[] {1, 1});
  }
}
