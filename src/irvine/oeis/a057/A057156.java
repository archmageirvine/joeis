package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057156 Number of functions from {0,1}^n to {0,1}^n.
 * @author Sean A. Irvine
 */
public class A057156 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft((long) ++mN * (1L << mN));
  }
}

