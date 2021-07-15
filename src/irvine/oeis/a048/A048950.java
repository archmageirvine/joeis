package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a047.A047713;

/**
 * A048950 Base 3 Euler-Jacobi pseudoprimes.
 * @author Sean A. Irvine
 */
public class A048950 extends A047713 {

  @Override
  protected Z base() {
    return Z.THREE;
  }
}

