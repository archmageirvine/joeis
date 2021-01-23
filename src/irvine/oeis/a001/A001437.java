package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001437 Number of connected graphs with n nodes and ceiling(n(n-1)/4) edges.
 * @author Sean A. Irvine
 */
public class A001437 extends A001435 {

  {
    next();
  }

  @Override
  public final Z next() {
    return numberConnectedGraphs(++mN, (mN * (mN - 1) + 3) / 4);
  }
}
