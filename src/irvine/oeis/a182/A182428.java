package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182428 <code>a(n) = 2n(19-n)</code>.
 * @author Sean A. Irvine
 */
public class A182428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182428() {
    super(new long[] {1, -3, 3}, new long[] {0, 36, 68});
  }
}
