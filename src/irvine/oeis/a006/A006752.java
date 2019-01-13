package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A006752.
 * @author Sean A. Irvine
 */
public class A006752 extends DecimalExpansionSequence {

  // G = (pi/8) * log(2 + sqrt(3)) + (3/8) * sum_{n=0..infty} 1/((2n+1)^2 * binomial(2n,n))
  private static final CR C = CR.PI.divide(CR.valueOf(8)).multiply(CR.TWO.add(CR.THREE.sqrt()).log());
  private static final Q D = new Q(3, 8);

  private Q mSum = Q.ZERO;
  private CR mC = null;
  private int mN = -1;

  // Add another term into the approximation of the Khintchine constant.
  // Computed using ln K_0 = (1/ln(2)) * sum_{n=1}^\infty {(\zeta(2n)-1)/(n)} * sum_{k=1}^{2n-1} (-)^{k+1}/k
  private void step() {
    ++mN;
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(2L * mN + 1).square().multiply(Binomial.binomial(2L * mN, mN))));
    mC = C.add(CR.valueOf(mSum.multiply(D)));
    //System.out.println("mC=" + mC.toString(100));
  }

  @Override
  protected void ensureAccuracy(final int n) {
    // The constant 2 below is good for at least 1327 terms of this sequence
    // A larger number will accumulate greater accuracy but takes longer
    while (mN < 2 * n) {
      step();
    }
  }

  @Override
  protected CR getCR() {
    return mC;
  }
}
