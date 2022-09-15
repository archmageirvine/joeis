package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a028.A028657;

/**
 * A052264 Number of 5 X n binary matrices up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A052264 extends A028657 {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN, 5);
  }
}

