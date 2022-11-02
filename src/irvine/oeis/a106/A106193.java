package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106193 Expansion of sqrt(1-4x)/(1-2x^2).
 * @author Georg Fischer
 */
public class A106193 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106193() {
    // (-4*n+6)*r(n-1)+(8*n-12)*r(n-3)-2*n*r(n-2)+n*r(n) = 0
    super(0, "[[0],[-12, 8],[0,-2],[6,-4],[0, 1]", "1", 0);
  }
}
