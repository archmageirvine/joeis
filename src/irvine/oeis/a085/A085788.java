package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085788 Partial sums of <code>n 3-spaced</code> triangular numbers beginning with <code>t(3)</code>, e.g., <code>a(2)=t(3)+t(6)=6+21=27</code>.
 * @author Sean A. Irvine
 */
public class A085788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085788() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 27, 72, 150});
  }
}
