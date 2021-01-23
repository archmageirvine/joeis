package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A037089 Lexicographically earliest strictly increasing decimal autovarious sequence: a(n) = number of distinct n-digit endings (left-zero-padded) of elements in the sequence.
 * @author Sean A. Irvine
 */
public class A037089 extends MemorySequence {

  private Z mN = Z.ZERO;
  private final List<Set<Z>> mAllowed = new ArrayList<>();

  protected int base() {
    return 10;
  }

  @Override
  protected Z computeNext() {
    final int s = size();
    final Z mod = Z.valueOf(base()).pow(s);
    final Set<Z> h = new HashSet<>();
    mAllowed.add(h);
    for (final Z t : this) {
      h.add(t.mod(mod));
    }
    outer:
    while (true) {
      mN = mN.add(1);
      int k = 0;
      for (Z m = Z.ONE; m.compareTo(mod) <= 0; m = m.multiply(base()), ++k) {
        final Z r = mN.mod(m);
        if (!mAllowed.get(k).contains(r) && ((k < s && mAllowed.get(k).size() >= a(k).intValueExact()) || !mAllowed.get(k).add(r))) {
          continue outer;
        }
      }
      return mN;
    }
  }
}
