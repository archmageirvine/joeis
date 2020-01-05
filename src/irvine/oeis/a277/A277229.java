package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277229 Convolution of the odd-indexed triangular numbers <code>(A000384(n+1))</code> and the squares <code>(A000290)</code>.
 * @author Sean A. Irvine
 */
public class A277229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277229() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 10, 48, 158, 413});
  }
}
