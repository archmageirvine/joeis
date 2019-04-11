package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122013 Semi-Linear ( two branches) bonding 8 X 8 matrix Markov: Characteristic polynomial: <code>(1 - 7 x^2 + 13 x^4 - 7 x^6 + x^8)=(1 + x - 3 x^2 - x^3 + x^4)(1 - x - 3 x^2 +x^3 + x^4)</code>.
 * @author Sean A. Irvine
 */
public class A122013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122013() {
    super(new long[] {-1, 0, 7, 0, -13, 0, 7, 0}, new long[] {1, 8, 27, 49, 122, 241, 530, 1101});
  }
}
