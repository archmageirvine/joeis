package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.IntegersMod;

/**
 * A002329 Periods of reciprocals of integers prime to 10.
 * @author Sean A. Irvine
 */
public class A002329 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN.gcd(Z.TEN))) {
        final IntegersMod ring = new IntegersMod(mN);
        return ring.ord(Z.TEN.mod(mN));
      }
    }
  }
}
