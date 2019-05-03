package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121364 Convolution of <code>A066983</code> with the double Fibonacci sequence <code>A103609</code>.
 * @author Sean A. Irvine
 */
public class A121364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121364() {
    super(new long[] {-1, -1, 0, -1, 2, 1}, new long[] {0, 0, 1, 2, 3, 6});
  }
}
