package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A006853.
 * @author Sean A. Irvine
 */
public class A006853 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final HashMap<Pair<Integer, List<Integer>>, Z> mCache = new HashMap<>();
  private int mN = -1;

  private Z computeBigN(final int k, final int[] j) {
    Polynomial<Z> p = RING.one();
    for (int i = 1; i < j.length; ++i) {
      if (j[i] > 0) {
        p = RING.multiply(p, RING.pow(RING.onePlusXToTheN(i), j[i], k), k);
      }
    }
    return p.coeff(k);
  }

  private Z bigN(final int k, final int[] j) {
    final ArrayList<Integer> l = new ArrayList<>(j.length);
    for (final int t : j) {
      l.add(t);
    }
    final Pair<Integer, List<Integer>> key = new Pair<>(k, l);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z bn = computeBigN(k, j);
    mCache.put(key, bn);
    return bn;
  }

  private boolean isEvenA(final int[] j) {
    long s = 0;
    for (int i = 2; i < j.length; i += 2) {
      s += j[i];
    }
    return (s & 1) == 0;
  }

  protected Z bigN(final int n, final int k2) {
    assert (k2 & 1) == 0;
    final int k = k2 / 2;
    Q sum = Q.ZERO;
    final IntegerPartition part = new IntegerPartition(k2);
    final int[] j = new int[k2 + 1];
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      final Z nj = bigN(k, j).pow(n);
      sum = sum.signedAdd(isEvenA(j), new Q(nj, SymmetricGroup.per(j)));
    }
    //System.out.println("N_" + n + "," + k2 + "=" + sum);
    return sum.toZ();
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.TWO;
    }
    Z sum = Z.ONE; // k == 0 gives 1
    for (int k = 1; k < (1L << mN) / 4; ++k) {
      sum = sum.add(bigN(mN, 2 * k));
    }
    return sum.multiply2().add(bigN(mN, (1 << mN) / 2));
  }
}
