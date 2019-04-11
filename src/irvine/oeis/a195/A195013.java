package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195013 Multiples of 2 and of 3 interleaved: <code>a(2n-1) = 2n, a(2n) = 3n</code>.
 * @author Sean A. Irvine
 */
public class A195013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195013() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 3, 4, 6});
  }
}
