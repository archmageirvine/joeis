package irvine.oeis.a055;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055615 a(n) = n*moebius(n) (cf. A008683).
 * @author Sean A. Irvine
 */
public class A055615 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Mobius.mobius(++mN) * mN);
  }
}
