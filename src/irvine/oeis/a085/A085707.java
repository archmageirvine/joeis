package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a065.A065547;

/**
 * A085707 Triangular array A065547 unsigned and transposed.
 * @author Sean A. Irvine
 */
public class A085707 extends A065547 {

  protected Z t(final int n, final int m) {
    return super.t(n, n - m).abs();
  }
}

