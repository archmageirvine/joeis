package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076450 Natural sculptures.
 * @author Sean A. Irvine
 */
public class A076450 extends Sequence1 {

  private final Set<String> mSeen = new HashSet<>();
  private long mN = 0;

  private Collection<Integer> sculpture(final long n) {
    final ArrayList<Integer> sculpture = new ArrayList<>();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z pp : fs.toZArray()) {
      final int e = fs.getExponent(pp);
      final long p = pp.longValue();
      long q = p;
      int c = 1;
      while (q <= n) {
        q *= p;
        ++c;
      }
      while (c >= sculpture.size()) {
        sculpture.add(0);
      }
      sculpture.set(c, sculpture.get(c) + e);
    }
    return sculpture;
  }

  @Override
  public Z next() {
    while (true) {
      if (mSeen.add(sculpture(++mN).toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
