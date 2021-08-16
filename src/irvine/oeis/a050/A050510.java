package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050510 Golden rectangular box numbers: a(n) = n*A007067(n)*A007067(A007067(n)).
 * @author Sean A. Irvine
 */
public class A050510 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private Z b(final Z n) {
    return CR.PHI.multiply(n).round();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z bn = b(mN);
    return mN.multiply(bn).multiply(b(bn));
  }
}
