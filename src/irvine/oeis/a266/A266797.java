package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266797 <code>a(n) = (6^n + 4^n + 3*2^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A266797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266797() {
    super(new long[] {48, -44, 12}, new long[] {2, 8, 38});
  }
}
