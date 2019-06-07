package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000311 Schroeder's fourth problem; also number of phylogenetic trees with n nodes; also number of total partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A000311 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ZERO);
    } else if (mA.size() <= 2) {
      mA.add(Z.ONE);
    } else {
      final int n = mA.size() - 1;
      Z s = Z.ZERO;
      for (int k = 2; k < n; ++k) {
        s = s.add(Binomial.binomial(n, k).multiply(mA.get(k)).multiply(mA.get(n - k + 1)));
      }
      mA.add(s.multiply2().add(mA.get(n).multiply(n + 2)));
    }
    return mA.get(mA.size() - 1);
  }
}
