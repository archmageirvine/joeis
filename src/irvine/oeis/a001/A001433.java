package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001433.
 * @author Sean A. Irvine
 */
public class A001433 extends A001430 {

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN - 1);
  }
}
