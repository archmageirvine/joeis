package irvine.oeis.a059;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059912 Triangle T(n,k) of orders of n degree irreducible polynomials over GF(2) listed in ascending order, k=1..A059499(n).
 * @author Sean A. Irvine
 */
public class A059912 extends Sequence1 {

  // After Alois P. Heinz

  private final MemoryFunction1<TreeSet<Z>> mM = new MemoryFunction1<>() {
    @Override
    protected TreeSet<Z> compute(final int n) {
      final TreeSet<Z> s = new TreeSet<>();
      Collections.addAll(s, Jaguar.factor(Z.ONE.shiftLeft(n).subtract(1)).divisors());
      if (n > 1) {
        s.removeAll(mU.get(n - 1));
      }
      return s;
    }
  };

  private final MemoryFunction1<Set<Z>> mU = new MemoryFunction1<>() {
    @Override
    protected Set<Z> compute(final int n) {
      if (n == 0) {
        return Collections.emptySet();
      }
      final TreeSet<Z> res = new TreeSet<>();
      res.addAll(mM.get(n));
      res.addAll(mU.get(n - 1));
      return res;
    }
  };

  private final TreeSet<Z> mA = new TreeSet<>();
  protected int mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.addAll(mM.get(++mN));
    }
    return mA.pollFirst();
  }
}
