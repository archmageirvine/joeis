package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054578 Number of subsequences of {1..n} such that all differences of pairs of terms are distinct (i.e., number of Golomb rulers on {1..n}).
 * @author Sean A. Irvine
 */
public class A054578 implements Sequence {

  // After Alois P. Heinz

  private int mN = 0;
  private Z mA = Z.ONE;

  private Z b(final int n, final List<Integer> s) {
    if (n < 1) {
      return Z.ONE;
    }
    final List<Integer> sn = new ArrayList<>(s);
    sn.add(n);
    final int m = sn.size();
    final Z t = b(n - 1, s);
    final HashSet<Integer> seq = new HashSet<>();
    for (int i = 0; i < m - 1; ++i) {
      for (int j = i + 1; j < m; ++j) {
        seq.add(sn.get(i) - sn.get(j));
      }
    }
    final Z res;
    if (m * (m - 1) / 2 == seq.size()) {
      res = t.add(b(n - 1, sn));
    } else {
      res = t;
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mA = mA.add(b(mN - 1, Collections.singletonList(mN)));
    return mA;
  }
}
