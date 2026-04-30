package irvine.oeis.a265;

import irvine.math.z.Z;
import irvine.oeis.a395.A395475;

/**
 * A265627 Number of n X n "primitive" binary matrices.
 * @author Sean A. Irvine
 */
public class A265627 extends A395475 {

  private long mN = 0;

  @Override
  public Z next() {
    return psi(2, ++mN, mN);
  }
}

