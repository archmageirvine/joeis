package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001436.
 * @author Sean A. Irvine
 */
public class A001436 extends A001435 {

  @Override
  public Z next() {
    return numberConnectedGraphs(++mN, mN + 2);
  }
}
