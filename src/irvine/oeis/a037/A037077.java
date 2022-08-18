package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A037077 Decimal expansion of upper limit of - 1^(1/1) + 2^(1/2) - 3^(1/3) + ... .
 * @author Sean A. Irvine
 */
public class A037077 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A037077() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int p) {
        if (p >= 1) {
          return Z.ZERO;
        }
        //int n = -p;
        // Following precision might not be enough, if a problem is encountered the 350 can be made smaller.
        final int n = 1 - 131 * p / 350;
        final CR[] a = new CR[n];
        a[0] = CR.ONE;
        for (int m = 1; m < a.length; ++m) {
          final CR m1 = CR.valueOf(m + 1);
          final CR ln = m1.log().divide(m1);
          a[m] = ln.multiply(2).sinh().divide(CR.TWO)
            .add(ComputableReals.SINGLETON.pow(ln.cosh(), 2))
            .subtract(CR.ONE)
            .divide(ln.sinh());
        }
        final CR d0 = ComputableReals.SINGLETON.pow(CR.SQRT2.multiply(2).add(CR.THREE), n);
        final CR d = d0.multiply(CR.HALF).add(d0.inverse().multiply(CR.HALF));
        CR b = CR.valueOf(-1);
        CR c = d.negate();
        CR s = CR.ZERO;
        final long n2 = n * (long) n;
        for (int k = 0; k < n; ++k) {
          c = b.subtract(c);
          b = b.multiply(CR.TWO).multiply(k * (long) k - n2).divide(CR.valueOf((2L * k + 1) * (k + 1)));
          s = s.add(c.multiply(a[k]));
        }
        return CR.HALF.subtract(s.divide(d)).getApprox(p);
      }
    });
  }
}
