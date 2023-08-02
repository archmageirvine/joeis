package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028990 Largest palindromic prime with 2n-1 digits.
 * @author Sean A. Irvine
 */
public class A028990 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.TEN.pow(2L * mN + 1).subtract(1);
    final Z aS = Z.TEN.pow(mN + 3).add(mN >= 3 ? Z.TEN.pow(mN - 3) : Z.ZERO);
    final Z bS = Z.TEN.pow(mN + 2).add(mN >= 2 ? Z.TEN.pow(mN - 2) : Z.ZERO);
    final Z cS = Z.TEN.pow(mN + 1).add(mN >= 1 ? Z.TEN.pow(mN - 1) : Z.ZERO);
    final Z dS = Z.TEN.pow(mN);
    for (Z a = n; a.compareTo(n.subtract(aS.multiply(9))) >= 0; a = a.subtract(aS)) {
      for (Z b = a; b.compareTo(a.subtract(bS.multiply(9))) >= 0; b = b.subtract(bS)) {
        for (Z c = b; c.compareTo(b.subtract(cS.multiply(9))) >= 0; c = c.subtract(cS)) {
          for (Z d = c; d.compareTo(c.subtract(dS.multiply(9))) >= 0; d = d.subtract(dS)) {
            if (d.isProbablePrime()) {
              return d;
            }
          }
        }
      }
    }
    throw new UnsupportedOperationException("Could not find a(" + mN + ")");
  }
}
