package irvine.oeis.a108;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence0;

/**
 * A108171 Tribonacci version of A076662 using the positive real Pisot root of x^3 - x^2 - x - 1.
 * @author Sean A. Irvine
 */
public class A108171 extends DifferenceSequence {

  private static final CR BETA2 = new ZPolynomialFunction(Polynomial.create(-1, -1, -1, 1)).inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO).square();

  /** Construct the sequence. */
  public A108171() {
    super(0, new Sequence0() {
      private int mN = -1;

      @Override
      public Z next() {
        return BETA2.multiply(++mN).ceil().add(1);
      }
    });
  }
}

