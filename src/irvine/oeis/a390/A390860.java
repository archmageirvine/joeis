package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a371.A371949;

/**
 * A390860 a(n) is the minimum number of armies required for an attacker to have a 50% or better chance of beating a defender with n armies in the game Risk.
 * @author Sean A. Irvine
 */
public class A390860 extends A371949 {

  private int mN = 0;
  private int mAttackers = 1;

  @Override
  public Z next() {
    ++mN;
    while (t(mAttackers, mN).compareTo(Q.HALF) < 0) {
      ++mAttackers;
    }
    return Z.valueOf(1 + mAttackers);
  }
}
