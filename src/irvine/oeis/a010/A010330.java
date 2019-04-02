package irvine.oeis.a010;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010330 n such C(n,3) = C(x,3) + C(y,3) is solvable.
 * @author Sean A. Irvine
 */
public class A010330 implements Sequence {

  private long mN = 3;
  private final TreeSet<Z> mExpressible = new TreeSet<>();

  @Override
  public Z next() {
    Z currentBinomial = Binomial.binomial(mN, 3);
    while (true) {
      while (mExpressible.isEmpty() || mExpressible.first().compareTo(currentBinomial) > 0) {
        for (long m = 3; m <= mN; ++m) {
          mExpressible.add(currentBinomial.add(Binomial.binomial(m, 3)));
        }
        currentBinomial = Binomial.binomial(++mN, 3);
      }
      final Z e = mExpressible.pollFirst();
      if (currentBinomial.equals(e)) {
        return Z.valueOf(mN);
      }
    }
  }
}
