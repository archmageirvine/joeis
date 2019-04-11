package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027086 <code>a(n) =</code> T(n, <code>n+4),</code> T given by A027082.
 * @author Sean A. Irvine
 */
public class A027086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027086() {
    super(new long[] {-1, 2, -1, 2, -5, 4}, new long[] {11, 41, 108, 246, 517, 1035});
  }
}
