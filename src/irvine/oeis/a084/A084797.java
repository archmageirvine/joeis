package irvine.oeis.a084;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A084797 Greatest number formed by concatenating prime factors of n in base 10.
 * @author Sean A. Irvine
 */
public class A084797 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final List<Integer> s = new ArrayList<>();
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      for (int k = 0; k < e; ++k) {
        s.add(p.intValue());
      }
    }
    final int[] set = IntegerUtils.toInt(s);
    final Permutation perm = new Permutation(set);
    Z max = Z.ZERO;
    int[] p;
    while ((p = perm.next()) != null) {
      max = max.max(Permutation.permToZ(p));
    }
    return max;
  }
}
