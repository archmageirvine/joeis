package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126866 <code>a(n) = 13*a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A126866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126866() {
    super(new long[] {-1, 13}, new long[] {1, 14});
  }
}
