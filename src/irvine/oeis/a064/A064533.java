package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A064533 Decimal expansion of Landau-Ramanujan constant.
 * @author Sean A. Irvine
 */
public class A064533 extends DecimalExpansionSequence {

  // todo not quite accurate enough -- found problems in my zeta

  /*
  (* Victor Adamchik calculated 5100 digits of the Landau-Ramanujan constant using Mathematica (from Mathematica 4 demos): *) LandauRamanujan[n_] := With[{K = Ceiling[Log[2, n*Log[3, 10]]]}, N[Product[(((1 - 2^(-2^k))*4^2^k*Zeta[2^k])/(Zeta[2^k, 1/4] - Zeta[2^k, 3/4]))^2^(-k - 1), {k, 1, K}]/Sqrt[2], n]];
   */

  private static final Q THREE_QUARTERS = new Q(3, 4);
  private static final int EXTRA_PRECISION = 0;

  /** Construct the sequence. */
  public A064533() {
    super(new CR() {

      private CR term(final int k) {
        final int j = 1 << k;
        final Q q = Q.ONE.subtract(new Q(Z.ONE, Z.ONE.shiftLeft(j)));
        final CR top = Zeta.zeta(j).multiply(q).multiply(Z.ONE.shiftLeft(2 * j));
        final CR bot = Zeta.zetaHurwitz(j, Q.ONE_QUARTER).subtract(Zeta.zetaHurwitz(j, THREE_QUARTERS));
        return top.divide(bot).pow(new Q(1, 2L * j));
      }

      @Override
      protected Z approximate(final int precision) {
        final int workingPrecision = precision - EXTRA_PRECISION;
        System.out.println("prec=" + precision);
        int k = 0;
        final Z scaledOne = CR.ONE.getApprox(workingPrecision);
        Z prod = scaledOne;
        while (true) {
          final CR t = term(++k);
          //System.out.println("k=" + k + " t=" + t.toString());
          final Z term = t.getApprox(workingPrecision);
          prod = CR.scale(prod.multiply(term), workingPrecision);
          if (scaledOne.compareTo(term) >= 0) {
            break;
          }
        }
        return prod.shiftRight(EXTRA_PRECISION);
      }
    }.divide(CR.SQRT2));

//    System.out.println(Zeta.zetaHurwitz(1 << 6, THREE_QUARTERS).toString(50));
//    System.out.println(Zeta.zeta((1 << 6) + 1).toString(50));
//    System.out.println(Zeta.zeta((1 << 6) + 63).toString(50));
//    System.out.println(Zeta.zeta((1 << 6) + 101).toString(50));
  }
}
