package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086318 Decimal expansion of asymptotic constant eta for counts of weakly binary trees.
 * @author Sean A. Irvine
 */
public class A086318 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086318() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z c = Z.TWO;
        Z x = Z.ZERO;
        Z p = Z.ONE;
        CR s = CR.THREE;
        long n = 0;
        while (true) {
          ++n;
          c = c.square().add(2);
          p = p.multiply(c);
          s = s.add(CR.valueOf(p).inverse());
          final Z t = x;
          x = CR.valueOf(c).pow(CR.valueOf(Z.ONE.shiftLeft(n)).inverse()).divide(CR.PI).multiply(s).sqrt().divide(CR.TWO).getApprox(precision);
          if (x.equals(t)) {
            return t;
          }
        }
      }
    });
  }
}
