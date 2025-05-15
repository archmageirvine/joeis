package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074455 Consider the volume of unit sphere as a function of the dimension d; maximize this as a function of d (considered as a continuous variable); sequence gives decimal expansion of the best d.
 * @author Sean A. Irvine
 */
public class A074455 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074455() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final UnaryCrFunction v = new UnaryCrFunction() {
          @Override
          public CR execute(final CR x) {
            final CR halfX = x.divide(2);
            return CR.PI.pow(halfX).multiply(2).divide(CrFunctions.GAMMA.cr(halfX)).divide(x);
          }
        };

        CR lo = CR.FIVE;
        CR hi = CR.SIX;
        while (true) {
          final CR mid = lo.add(hi).divide(2);
          final CR mx = v.execute(mid);
          final CR t = lo.add(mid).divide(2);
          final CR tx = v.execute(t);
          final int c1 = tx.compareTo(mx, precision);
          if (c1 > 0) {
            hi = mid;
          } else if (c1 < 0) {
            lo = t;
          }
          final CR u = hi.add(mid).divide(2);
          final CR ux = v.execute(u);
          final int c2 = ux.compareTo(mx, precision);
          if (c2 > 0) {
            lo = mid;
          } else if (c2 < 0) {
            hi = u;
          }
          if (c1 == 0 && c2 == 0) {
            return mid.getApprox(precision);
          }
        }
      }
    });
  }
}
