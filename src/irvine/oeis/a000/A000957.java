package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000957 Fine's sequence (or Fine numbers): number of relations of valence <code>&gt;= 1</code> on <code>an</code> n-set; also number of ordered rooted trees with n edges having root of even degree.
 * @author Sean A. Irvine
 */
public class A000957 extends A000108 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.NEG_ONE;
      return Z.ZERO;
    }
    if (mA == Z.NEG_ONE) {
      mA = super.next();
      return Z.ONE;
    }
    mA = super.next().subtract(mA).divide(2);
    return mA;
  }
}
