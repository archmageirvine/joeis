package irvine.oeis.a080;

import java.util.ArrayList;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.Permutation;

/**
 * A080202 Triangle T(b,k) read by rows, giving numbers of pairs of unequal permutations of all the digits 1, ..., k in base b (k&lt;b) whose ratio is an integer.
 * @author Sean A. Irvine
 */
public class A080202 extends Sequence3 {

  private int mN = 3;
  private int mM = 1;

  static Z count(final int n, final int m) {
    final ArrayList<Long> values = new ArrayList<>();
    final Permutation perm = new Permutation(IntegerUtils.identity1(new int[m]));
    int[] p;
    while ((p = perm.next()) != null) {
      values.add(Permutation.permToZ(p, n).longValueExact());
    }
    // Note values will already be sorted in increasing order
    long cnt = 0;
    for (final long q : values) {
      for (final long r : values) {
        if (q == r) {
          break;
        }
        if (q % r == 0) { // do not need r % q because q > r
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 2;
    }
    return count(mN, mM);
  }
}

