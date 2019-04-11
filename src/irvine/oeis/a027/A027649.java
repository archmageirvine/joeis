package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027649 <code>a(n) = 2*(3^n) - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A027649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027649() {
    super(new long[] {-6, 5}, new long[] {1, 4});
  }
}
