package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A037183 Smallest number that is palindromic (with at least 2 digits) in n bases.
 * @author Sean A. Irvine
 */
public class A037183 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  protected final List<Integer> mOrdering = new ArrayList<>(); // Needed only for A065708
  protected int mN = 0;
  private long mM = 2;
  private long mAdd = 1;

  @Override
  public Z next() {
    if (++mN == 8) {
      // After a(7) result is 0 (mod 12)
      mAdd = 12;
      mM = 108;
    }
    while (mFirsts.get(mN) == 0) {
      mM += mAdd;
      int cnt = 0;
      for (int base = 2; base < mM; ++base) {
        if (Predicates.PALINDROME.is(base, mM)) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mOrdering.add(cnt);
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
