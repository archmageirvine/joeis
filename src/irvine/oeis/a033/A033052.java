package irvine.oeis.a033;

import irvine.oeis.a037.A037454;

/**
 * A033052 a(1) = 1, a(2n) = 16a(n), a(2n+1) = a(2n)+1.
 * @author Sean A. Irvine
 */
public class A033052 extends A037454 {

  /** Construct the sequence. */
  public A033052() {
    super(0, 2, 16);
  }
}
