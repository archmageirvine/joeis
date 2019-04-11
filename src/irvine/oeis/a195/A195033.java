package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195033 Multiples of 21 and of 20 interleaved: <code>a(2n-1) = 21n, a(2n) = 20n</code>.
 * @author Sean A. Irvine
 */
public class A195033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195033() {
    super(new long[] {-1, 0, 2, 0}, new long[] {21, 20, 42, 40});
  }
}
