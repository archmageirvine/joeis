package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075561 Domination number for kings' graph <code>K(n)</code>.
 * @author Sean A. Irvine
 */
public class A075561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075561() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 1, 1, 4, 4, 4, 9});
  }
}
