package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A075099.
 * @author Sean A. Irvine
 */
public class A075099 extends Sequence1  {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private List<String> words(final int len) {
    final List<String> w = new ArrayList<>(1 << len);
    for (int j = 0; j < 1 << len; ++j) {
      final StringBuilder sb = new StringBuilder();
      for (int i = 0; i < len; ++i) {
        sb.append((j & (1 << i)) == 0 ? 'x' : 'y');
      }
      w.add(sb.toString());
    }
    return w;
  }

  private boolean search(final Collection<String> targets, final Set<String> precursors) {
    final Set<String> s = new HashSet<>(); // Seed the generator
    s.add("x");
    s.add("y");
    Set<String> r = s;
    while (true) {
      final Set<String> newValues = new HashSet<>();
      for (final String e : r) {
        for (final String f : s) {
          final String a = e + f;
          if (a.length() <= mN) {
            if (precursors.contains(a)) {
              newValues.add(a);
            }
            final String b = f + e;
            if (precursors.contains(b)) {
              newValues.add(b);
            }
          }
        }
      }
      if (newValues.isEmpty()) {
        break;
      }
      s.addAll(newValues);
      r = newValues;
    }
    return s.containsAll(targets);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final List<String> targets = words(mN); // These are all the words of length mN to be generated
    final List<String> allPrecursors = new ArrayList<>();
    for (int k = 2; k < mN; ++k) {
      allPrecursors.addAll(words(k));
    }
    if (allPrecursors.size() > Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    long best = allPrecursors.size() + targets.size();
    // Start with all intermediate words and keep reducing the number of words until
    // it is no longer possible to construct all the target words
    for (long y = (1L << allPrecursors.size()) - 1; y > 0; y >>>= 1) {
      if (mVerbose) {
        StringUtils.message(mN + " searching with " + Long.bitCount(y) + " precursors");
      }
      boolean better = false;
      for (long set = y; set < 1L << allPrecursors.size(); set = Functions.SWIZZLE.l(set)) {
        final Set<String> precursors = new HashSet<>(targets); // Always include all the targets
        for (int k = 0; k < allPrecursors.size(); ++k) {
          if ((set & 1L << k) != 0) {
            precursors.add(allPrecursors.get(k));
          }
        }
        if (search(targets, precursors)) {
          if (mVerbose) {
            StringUtils.message(mN + " new best: " + precursors.size());
          }
          best = precursors.size();
          better = true;
          break; // No need to bother trying other sets of this size
        }
      }
      if (!better) {
        if (mVerbose) {
          StringUtils.message(mN + " no solution with " + Long.bitCount(y) + " precursors");
        }
        break;
      }
    }
    return Z.valueOf(best);
  }

}
