package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127146 <code>Q(n,4)</code>, where <code>Q(m,k)</code> is defined in <code>A127080</code> and <code>A127137</code>.
 * @author Sean A. Irvine
 */
public class A127146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127146() {
    super(new long[] {1, -3, 3}, new long[] {12, 3, -4});
  }
}
