package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145976 Expansion of <code>1/(1-x*(1-7*x))</code>.
 * @author Sean A. Irvine
 */
public class A145976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145976() {
    super(new long[] {-7, 1}, new long[] {1, 1});
  }
}
