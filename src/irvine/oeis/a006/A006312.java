package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A006312 Discriminants of period polynomials.
 * @author Sean A. Irvine
 */
public class A006312 extends A006308 {

  /** Construct the sequence. */
  public A006312() {
    super(3);
  }

//  private CR p(final int p, final int q, final int k) {
//    CR pk = CR.ONE;
//    for (int i = 0; i < p; ++i) {
//      pk = pk.multiply(etaStar(p, q, i).subtract(etaStar(p, q, i + k)));
//    }
//    return pk;
//  }

  @Override
  public Z next() {
    mP = (int) mPrime.nextPrime(mP);
    final long p2 = mP * mP;
    final Z g = ZUtils.leastPrimitiveRoot(Z.valueOf(p2));
    final int q = g.modPow(Z.valueOf(mP), Z.valueOf(p2)).intValueExact();
    final CR[] etaStar = new CR[mP];
    for (int i = 0; i < etaStar.length; ++i) {
      etaStar[i] = etaStar(mP, q, i);
    }
    // The paper gives multiple expressions for D, some where the individual
    // terms in the product are squared.  But it seems to me that the
    // squaring is unnecessary except strangely for p == 3.
    CR d = CR.ONE;
    for (int i = 0; i < mP; ++i) {
      for (int j = i + 1; j < mP; ++j) {
        d = d.multiply(etaStar[i].subtract(etaStar[j]));
      }
    }
    final Z z = d.toZ();
    return mP == 3 ? z.square() : z.abs();
  }
}

