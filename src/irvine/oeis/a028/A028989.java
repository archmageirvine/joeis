package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028989 Smallest palindromic prime with 2n-1 digits.
 * @author Sean A. Irvine
 */
public class A028989 implements Sequence {

  // After Charles R Greathouse IV

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(100).pow(mN).add(1);
    final Z aS = Z.TEN.pow(mN + 3).add(mN >= 3 ? Z.TEN.pow(mN - 3) : Z.ZERO);
    final Z bS = Z.TEN.pow(mN + 2).add(mN >= 2 ? Z.TEN.pow(mN - 2) : Z.ZERO);
    final Z cS = Z.TEN.pow(mN + 1).add(mN >= 1 ? Z.TEN.pow(mN - 1) : Z.ZERO);
    final Z dS = Z.TEN.pow(mN);
    for (Z a = n; a.compareTo(n.add(aS.multiply(9))) <= 0; a = a.add(aS)) {
      for (Z b = a; b.compareTo(a.add(bS.multiply(9))) <= 0; b = b.add(bS)) {
        for (Z c = b; c.compareTo(b.add(cS.multiply(9))) <= 0; c = c.add(cS)) {
          for (Z d = c; d.compareTo(c.add(dS.multiply(9))) <= 0; d = d.add(dS)) {
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
