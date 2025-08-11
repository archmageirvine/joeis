package irvine.oeis.a386;

import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386673 allocated for David Bevan.
 * @author Sean A. Irvine
 */
public class A386673 extends Sequence1 {

  private final TreeMap<CR, Integer> mA = new TreeMap<>();
  private int mK = 0;
  private int mN = 8;

  // L(k) = k * Sum_{j=0..k-1} (-1)^j*(k-j)^(j-1)*exp(k-j)/j!
  private CR l(final int k) {
    if (k == 1) {
      return CR.E.subtract(1);
    }
    return ComputableReals.SINGLETON.sum(1, k - 1, j -> CR.valueOf(k - j).exp().multiply(new Q(Z.NEG_ONE.pow(j).multiply(Z.valueOf(k - j).pow(j - 1)), Functions.FACTORIAL.z(j))))
      .add(CR.valueOf(k).exp().divide(k)) // Contribution for j == 0
      .multiply(k);
  }

  @Override
  public Z next() {
    mN += 2;
    while (mK < mN) {
      mA.put(l(++mK), mK);
    }
    while (mA.size() > 8) {
      mA.pollLastEntry();
    }
    return Z.valueOf(mA.pollFirstEntry().getValue());
  }
}
