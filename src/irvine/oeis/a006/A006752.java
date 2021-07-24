package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A006752 Decimal expansion of Catalan's constant 1 - 1/9 + 1/25 - 1/49 + 1/81 - ...
 * @author Sean A. Irvine
 */
public class A006752 extends DecimalExpansionSequence {

  // G = (pi/8) * log(2 + sqrt(3)) + (3/8) * sum_{n=0..infty} 1/((2n+1)^2 * binomial(2n,n))
  private static final CR C = CR.PI.divide(CR.EIGHT).multiply(CR.TWO.add(CR.THREE.sqrt()).log());
  private static final Q D = new Q(3, 8);
  private static final CR SCALED_G = new CR() {
    @Override
    protected Z approximate(final int precision) {
      if (precision >= 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final Z one = Z.ONE.shiftLeft(-precision);
      long k = -1;
      while (true) {
        final Z t = one.divide(Binomial.binomial(2 * ++k, k).multiply(2 * k + 1).multiply(2 * k + 1));
        if (t.isZero()) {
          break;
        }
        sum = sum.add(t);
      }
      return sum;
    }
  };

  /** Construct the sequence. */
  public A006752() {
    super(SCALED_G.multiply(D).add(C));
  }
}
