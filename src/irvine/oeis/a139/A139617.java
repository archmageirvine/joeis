package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139617 <code>a(n) = 136*n + 17</code>.
 * @author Sean A. Irvine
 */
public class A139617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139617() {
    super(new long[] {-1, 2}, new long[] {17, 153});
  }
}
