package irvine.oeis.a344;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000670;
import irvine.util.array.DynamicArray;

/**
 * A344900 a(n) is the number of well-formed formulas (wffs) of zeroth-order logic containing n characters (see comments).
 * @author Sean A. Irvine
 */
public class A344900 extends Sequence1 {

  // There is a complication arising from ignoring the outer most set of
  // parentheses. mWff1 tracks wff that do not need parentheses, while
  // mWff2 is for those that do.
  //
  // We use a generic connective "*" and generic variable "A", and keep
  // track of all the distinct "forms" of wff with a given length. For
  // each of these forms we can compute the number of possible assignments
  // to the variables and connectives.

  private final DynamicArray<Set<String>> mWff1 = new DynamicArray<>();
  private final DynamicArray<Set<String>> mWff2 = new DynamicArray<>();
  private final MemorySequence mA670 = MemorySequence.cachedSequence(new A000670());
  private int mN = 0;

  private Set<String> wff1(final int n) {
    final Set<String> h = mWff1.get(n);
    if (h != null) {
      return h;
    }
    final Set<String> t = new HashSet<>();
    mWff1.set(n, t);
    return t;
  }

  private Set<String> wff2(final int n) {
    final Set<String> h = mWff2.get(n);
    if (h != null) {
      return h;
    }
    final Set<String> t = new HashSet<>();
    mWff2.set(n, t);
    return t;
  }

  private Z count(final String s) {
    long cnt = 1; // Account for connectives
    int vars = 0; // Number of variables
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '*') {
        cnt *= 4;
      } else if (s.charAt(k) == 'A') {
        ++vars;
      }
    }
    return mA670.a(vars).multiply(cnt);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mWff1.set(1, Collections.singleton("A"));
      mWff2.set(1, Collections.emptySet());
    } else if (mN == 2) {
      mWff1.set(2, Collections.singleton("~A"));
      mWff2.set(2, Collections.emptySet());
    } else {
      final Set<String> h1 = wff1(mN);
      final Set<String> h2 = wff2(mN);
      for (final String t : wff1(mN - 1)) {
        h1.add("~" + t);
      }
      for (final String t : wff2(mN - 3)) {
        h1.add("~" + t);
      }
      for (int left = 1; left < mN; ++left) {
        final int right = mN - left - 1;
        for (final String l : wff1(left)) {
          for (final String r : wff1(right)) {
            final String t = "(" + l + '*' + r + ")";
            h2.add(t);
          }
        }
      }
//      System.out.println("n=" + mN);
//      System.out.println(h1);
//      System.out.println(h2);
    }

    Z cnt = Z.ZERO;
    for (final String wff : wff1(mN)) {
      cnt = cnt.add(count(wff));
    }
    for (final String wff : wff2(mN)) {
      cnt = cnt.add(count(wff));
    }
    return cnt;
  }

}
