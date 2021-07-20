package irvine.oeis.a083;

import java.util.ArrayList;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A083006 Numbers k such that Sum_{j=0..k-1} Bernoulli(j)*binomial(k,j)^2 is an integer.
 * @author Sean A. Irvine
 */
public class A083006 implements Sequence {

  private int mN = -1;
  private final BernoulliSequence mBS = new BernoulliSequence(0);
  private final ArrayList<Q> mBern = new ArrayList<>();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      Q sum = Q.ZERO;
      if (++mN > 0) {
        mBern.add(mBS.nextQ());
        for (int k = 0; k < mN; ++k) {
          final Q b = mBern.get(k);
          if (!Q.ZERO.equals(b)) {
            // Avoid computing binomial if multiplying by 0
            sum = sum.add(b.multiply(Binomial.binomial(mN, k).square()));
          }
        }
        if (mVerbose && mN % 100 == 0) {
          System.err.println("[" + mN + "]");
        }
      }
      if (sum.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

