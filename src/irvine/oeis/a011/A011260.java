package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A011260.
 * @author Sean A. Irvine
 */
public class A011260 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Euler.phi(Z.ONE.shiftLeft(mN).subtract(Z.ONE)).divide(mN);
  }
}

