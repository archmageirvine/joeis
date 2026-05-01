package irvine.oeis.a084;

import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084680 Order of 10 modulo n [i.e., least m such that 10^m = 1 (mod n)] or 0 when no such number exists.
 * @author Sean A. Irvine
 */
public class A084680 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.gcd(Z.TEN).isOne()) {
      final IntegersMod ring = new IntegersMod(mN);
      return ring.ord(Z.TEN.mod(mN));
    }
    return Z.ZERO;
  }
}
