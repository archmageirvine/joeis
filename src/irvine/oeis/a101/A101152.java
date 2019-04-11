package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101152 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+569)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A101152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101152() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 111, 1260, 1707, 2280, 8791, 11380});
  }
}
