package irvine.oeis.a290;

import irvine.math.z.Z;
import irvine.oeis.a395.A395475;

/**
 * A290754 Number of 4 X n binary matrices that are "primitive"; that is, they cannot be expressed as a "tiling" by a smaller matrix.
 * @author Sean A. Irvine
 */
public class A290754 extends A395475 {

  private long mN = 0;

  @Override
  public Z next() {
    return psi(2, 4, ++mN);
  }
}

