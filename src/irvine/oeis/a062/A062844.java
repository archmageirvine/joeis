package irvine.oeis.a062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062844 Numbers that, when expressed in some base, are the concatenation of numbers in two other bases.
 * @author Sean A. Irvine
 */
public class A062844 extends Sequence1 {

  private long mN = 9;

  private List<Long> toBase(long n, final long base) {
    final ArrayList<Long> lst = new ArrayList<>();
    while (n != 0) {
      lst.add(n % base);
      n /= base;
    }
    //Collections.reverse(lst); // having everything reversed does no harm, so we don't need this
    return lst;
  }

  private boolean is(final long n) {
    final HashSet<List<Long>> seen = new HashSet<>();
    for (long base = n; base > 1; --base) {
      final List<Long> lst = toBase(n, base);
      for (int k = 1; k < lst.size(); ++k) {
        if (seen.contains(lst.subList(0, k)) && seen.contains(lst.subList(k, lst.size()))) {
          return true;
        }
      }
      seen.add(lst);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
