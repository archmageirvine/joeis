package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018925 Isotropic subspaces of a 2n-dimensional unitary space over GF(4).
 * @author Sean A. Irvine
 */
public class A018925 implements Sequence {

  // Conjectured formula looks correct, cf. Taylor Exercise 8.1(ii)

  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(Z.ONE.shiftLeft(2 * ++mN).add(1));
    return mA;
  }
}

