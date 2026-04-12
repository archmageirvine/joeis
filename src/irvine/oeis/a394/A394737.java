package irvine.oeis.a394;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Permutation;

/**
 * A394737 a(n) is the number of unordered sets of unit fractions with smallest element 1/n that can be made into a pie so that no consecutive subset may be replaced by a larger unit fraction.
 * @author Sean A. Irvine
 */
public class A394737 extends Sequence2 {

  private int mN = 1;
  private long mCount = 0;

  private boolean is(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      Q sum = new Q(1, p[k]);
      for (int j = 1; j < p.length - 1; ++j) { // -1 because the complete sum is 1
        sum = sum.add(new Q(1, p[(k + j) % p.length]));
        if (sum.num().isOne()) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean is(final ArrayList<Integer> set) {
    final int[] s = new int[set.size()];
    for (int k = 0; k < set.size(); ++k) {
      s[k] = set.get(k);
    }
    final Permutation perm = new Permutation(s);
    int[] p;
    while ((p = perm.next()) != null) {
      if (is(p)) {
        //System.out.println(mN + " accept " + Arrays.toString(p));
        return true;
      }
    }
    return false;
  }

  private void search(final Q sum, final ArrayList<Integer> set, final int prev) {
    if (sum.isOne()) {
      if (is(set)) {
        ++mCount;
      }
      return;
    }
    for (int k = prev; k >= 2; --k) {
      final Q t = new Q(1, k);
      final Q s = sum.add(t);
      if (s.compareTo(Q.ONE) <= 0) {
        set.add(k);
        search(s, set, k);
        set.remove(set.size() - 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final ArrayList<Integer> lst = new ArrayList<>();
    final Q e = new Q(1, mN);
    lst.add(mN);
    search(e, lst, mN);
    return Z.valueOf(mCount);
  }
}
