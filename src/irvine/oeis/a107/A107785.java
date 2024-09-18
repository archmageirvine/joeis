package irvine.oeis.a107;
// manually 2024-09-14/holos at 2024-09-16 14:40

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A107785 Sequence obtained using characteristic polynomial that is Laplace transform of the tribonacci characteristic polynomial: -s^4*L(t^3 -t^2 -t -1) = s^3 +s^2 +2*s -6.
 * absolute value of the coefficients of the gf x*(1+2*x)/(1 +x +2*x^2 -6*x^3)
 * @author Georg Fischer
 */
public class A107785 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107785() {
    super(0, "[[0], [6], [-2], [-1], [-1]]", "0, 1, 1", 0, 0);
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
