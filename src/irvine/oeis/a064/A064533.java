package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A057574.
 * @author Sean A. Irvine
 */
public class A064533 extends DecimalExpansionSequence {

  // todo not quite accurate enough

  private static final CR ONE_QUARTER = CR.valueOf(Q.ONE_QUARTER);
  private static final CR THREE_QUARTERS = CR.valueOf(new Q(3, 4));

  /** Construct the sequence. */
  public A064533() {
    super(new CR() {

      private CR term(final int k) {
        final int j = 1 << k;
        final Q q = Q.ONE.subtract(new Q(Z.ONE, Z.ONE.shiftLeft(j)));
        final CR top = Zeta.zeta(j).multiply(q).multiply(Z.ONE.shiftLeft(2 * j));
        final CR bot = Zeta.zetaHurwitz(j, ONE_QUARTER).subtract(Zeta.zetaHurwitz(j, THREE_QUARTERS));
        return top.divide(bot).pow(new Q(1, 2L * j));
      }

      @Override
      protected Z approximate(final int precision) {
        int k = 0;
        final Z scaledOne = CR.ONE.getApprox(precision);
        Z prod = scaledOne;
        while (true) {
          final CR t = term(++k);
          System.out.println("k=" + k + " t=" + t);
          final Z term = t.getApprox(precision);
          if (scaledOne.compareTo(term) >= 0) {
            break;
          }
          prod = CR.scale(prod.multiply(term), precision);
        }
        return prod;
      }
    }.divide(CR.SQRT2));
  }
}
