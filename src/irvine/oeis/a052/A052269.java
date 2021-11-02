package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a246.A246106;

/**
 * A052269 Number of n X n matrices over GF(3) under row and column permutations.
 * @author Sean A. Irvine
 */
public class A052269 extends A246106 {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN, 3);
  }
}
