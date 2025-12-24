package irvine.oeis.a082;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002385;

/**
 * A082807 Palindromic primes p with property that another palindromic prime with as many digits can be obtained by using all the digits of p with a different frequency &gt;=1 (every digit is used at least once).
 * @author Sean A. Irvine
 */
public class A082807 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Sequence mPP = new A002385();
  private Z mP = mPP.next();
  private int mDigits = 0;

  private boolean ok(final List<Z> lst, final Z val) {
    final int[] cnts = ZUtils.digitCounts(val);
    for (final Z t : lst) {
      if (!t.equals(val) && !Arrays.equals(cnts, ZUtils.digitCounts(t))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mDigits;
      final HashMap<Integer, List<Z>> matches = new HashMap<>();
      while (Functions.DIGIT_LENGTH.i(mP) == mDigits) {
        final int syn = Functions.SYNDROME.i(mP);
        final List<Z> lst = matches.get(syn);
        if (lst != null) {
          lst.add(mP);
        } else {
          final ArrayList<Z> t = new ArrayList<>();
          t.add(mP);
          matches.put(syn, t);
        }
        mP = mPP.next();
      }
      for (final List<Z> lst : matches.values()) {
        if (lst.size() > 1) {
          // It is not sufficient that the syndrome is the same, we still need to remove cases like 17971 and 71917
          // Cf. A082808 (although that has a different complication with leading 0s)
          for (final Z v : lst) {
            if (ok(lst, v)) {
              mA.add(v);
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
