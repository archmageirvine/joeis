package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a246.A246106;

/**
 * A052272 Number of n X n matrices over GF(5) under row and column permutations.
 * @author Sean A. Irvine
 */
public class A052272 extends A246106 {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN, 5);
  }
}
