package irvine.oeis.a010;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010332 Consider integers z such that C(z,4) = C(x,4) + C(y,4), x &gt;= y &gt;= 4, is solvable. Sequence gives values of x.
 * @author Sean A. Irvine
 */
public class A010332 implements Sequence {

  private long mN = 4;
  private final TreeMap<Z, Long> mExpressible = new TreeMap<>();

  @Override
  public Z next() {
    Z currentBinomial = Binomial.binomial(mN, 4);
    while (true) {
      while (mExpressible.isEmpty() || mExpressible.firstKey().compareTo(currentBinomial) > 0) {
        for (long m = 4; m <= mN; ++m) {
          mExpressible.put(currentBinomial.add(Binomial.binomial(m, 4)), mN);
        }
        currentBinomial = Binomial.binomial(++mN, 4);
      }
      final Map.Entry<Z, Long> e = mExpressible.pollFirstEntry();
      if (currentBinomial.equals(e.getKey())) {
        return Z.valueOf(e.getValue());
      }
    }
  }
}
