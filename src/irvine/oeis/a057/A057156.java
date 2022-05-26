package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057156 Number of functions from {0,1}^n to {0,1}^n.
 * @author Sean A. Irvine
 */
public class A057156 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * (1 << mN));
  }
}

