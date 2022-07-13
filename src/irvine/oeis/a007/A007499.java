package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007499 Related to hexaflexagrams.
 * @author Sean A. Irvine
 */
public class A007499 implements Sequence {

  // Based on the description in Thomas J. O'Reilly,
  // "Classifying and Counting Hexaflexagrams"

  private HashSet<List<Integer>> mH = new HashSet<>();
  {
    mH.add(Arrays.asList(2, 2, 2));
  }

  private static final Comparator<List<Integer>> COMPARATOR = (a, b) -> {
    assert a.size() == b.size();
    for (int k = 0; k < a.size(); ++k) {
      final int c = a.get(k).compareTo(b.get(k));
      if (c != 0) {
        return c;
      }
    }
    return 0;
  };

  private List<Integer> canon(final List<Integer> lst) {
    List<Integer> canon = lst;
    int max = 0;
    for (final int v : lst) {
      if (v > max) {
        max = v;
      }
    }
    for (int k = 0; k < lst.size(); ++k) {
      if (lst.get(k) == max) {
        if (k > 0) {
          final ArrayList<Integer> candidate = new ArrayList<>(lst.size());
          for (int j = k; j < lst.size(); ++j) {
            candidate.add(lst.get(j));
          }
          for (int j = 0; j < k; ++j) {
            candidate.add(lst.get(j));
          }
          if (COMPARATOR.compare(candidate, canon) > 0) {
            canon = candidate;
          }
        }
        final ArrayList<Integer> reverse = new ArrayList<>(lst.size());
        for (int j = k; j >= 0; --j) {
          reverse.add(lst.get(j));
        }
        for (int j = lst.size() - 1; j > k; --j) {
          reverse.add(lst.get(j));
        }
        if (COMPARATOR.compare(reverse, canon) > 0) {
          canon = reverse;
        }
      }
    }
    return canon;
  }

  private List<Integer> augment(final List<Integer> lst, final int pos) {
    final ArrayList<Integer> res = new ArrayList<>(lst.size() + 1);
    for (int k = 0; k < lst.size(); ++k) {
      if (k == pos - 1) {
        res.add(lst.get(k) + 1);
      } else if (k == pos) {
        res.add(2);
        res.add(lst.get(k) + 1);
      } else {
        res.add(lst.get(k));
      }
    }
    return canon(res);
  }

  @Override
  public Z next() {
    long cnt = 0;
    final HashSet<List<Integer>> newH = new HashSet<>();
    for (final List<Integer> h : mH) {
      for (int k = h.size() - 2; k >= 0; --k) {
        if (h.get(k) == 2) {
          for (int j = k;j < h.size(); ++j) {
            newH.add(augment(h, j));
            ++cnt;
          }
          break;
        }
      }
    }
    mH = newH;
    return Z.valueOf(cnt);
  }
}
