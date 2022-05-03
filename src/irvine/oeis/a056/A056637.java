package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A056637 a(n) is the least prime of class n-, according to the Erd\u0151s-Selfridge classification of primes.
 * @author Sean A. Irvine
 */
public class A056637 extends A000040 {

  private final List<Set<Z>> mClassSets = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      if (Z.TWO.equals(prime)) {
        final HashSet<Z> h = new HashSet<>();
        h.add(prime);
        mClassSets.add(h);
        return prime;
      }
      final FactorSequence fs = Cheetah.factor(prime.subtract(1));
      final Z[] t = fs.toZArray();
      if (t[t.length - 1].compareTo(Z.THREE) <= 0) {
        mClassSets.get(0).add(prime);
      } else {
        int c = -1;
        for (final Z p : t) {
          for (int k = c + 1; k < mClassSets.size(); ++k) {
            if (mClassSets.get(k).contains(p)) {
              c = k;
              break;
            }
          }
        }
        if (++c == mClassSets.size()) {
          final HashSet<Z> h = new HashSet<>();
          h.add(prime);
          mClassSets.add(h);
          return prime;
        } else {
          mClassSets.get(c).add(prime);
        }
      }
    }
  }
}
