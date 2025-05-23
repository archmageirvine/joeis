package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006046;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077464 Stolarsky-Harborth constant; lim inf_{n-&gt;oo} F(n)/n^theta, where F(n) is the number of odd binomial coefficients in the first n rows and theta=log(3)/log(2).
 * @author Sean A. Irvine
 */
public class A077464 extends DecimalExpansionSequence {

  private static final CR EXPONENT = CR.THREE.log().divide(CR.LOG2);

  /** Construct the sequence. */
  public A077464() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence mins = new A077465();
        final DirectSequence f = new A006046();
        Z k = mins.next(); // == 1
        Z a = CR.valueOf(f.a(k)).divide(CR.valueOf(k).pow(EXPONENT)).getApprox(precision);
        while (true) {
          k = mins.next();
          final Z b = CR.valueOf(f.a(k)).divide(CR.valueOf(k).pow(EXPONENT)).getApprox(precision);
          if (a.equals(b)) {
            return a;
          }
          a = b;
        }
      }
    });
  }
}
