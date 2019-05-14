package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022144 Coordination sequence for root lattice <code>B_2</code>.
 * @author Sean A. Irvine
 */
public class A022144 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(8);
    return Z.ZERO.equals(mN) ? Z.ONE : mN;
  }
}
