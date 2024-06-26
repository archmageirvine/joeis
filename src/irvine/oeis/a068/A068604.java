package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A068604 Number of distinct coefficients in expansion related to enumeration of permutations of length n by length of longest subsequence.
 * @author Sean A. Irvine
 */
public class A068604 extends Sequence1 {

  // Implementation based on table and description on p. 379 of Hammersley

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private Map<List<Integer>, Z> mS = Collections.singletonMap(Arrays.asList(0, 1), Z.ONE);

  @Override
  public Z next() {
    if (++mN > 1) {
      final Map<List<Integer>, Z> map = new HashMap<>();
      for (final Map.Entry<List<Integer>, Z> e : mS.entrySet()) {
        final List<Integer> lst = e.getKey();
        final Z mul = e.getValue();
        for (int k = 0; k < mN; ++k) {
          boolean first = true;
          final List<Integer> newList = new ArrayList<>();
          for (final int v : lst) {
            if (v <= k) {
              newList.add(v);
            } else if (first) {
              first = false;
              newList.add(newList.get(newList.size() - 1) < k ? k : v + 1);
            } else {
              newList.add(v + 1);
            }
          }
          if (newList.get(newList.size() - 1) != mN) {
            newList.add(mN);
          }
          map.merge(newList, mul, Z::add);
        }
      }

      // (16.12) compliance check
//      for (final Map.Entry<List<Integer>, Z> e : mS.entrySet()) {
//        final List<Integer> lst = e.getKey();
//        final ArrayList<Integer> a = new ArrayList<>(lst);
//        a.add(mN);
//        final Z c1 = map.get(a);
//        final ArrayList<Integer> b = new ArrayList<>(lst);
//        b.set(b.size() - 1, mN);
//        final Z c2 = map.get(b);
//        if (!c1.add(c2).equals(e.getValue().multiply(mN))) {
//          throw new RuntimeException("Error detected during checking of (16.12): " + e.getKey());
//        }
//      }

      mS = map;
    }
    if (mVerbose) {
      StringUtils.message("Number of coefficients: " + mS.size() + " sum of coefficients " + Functions.SUM.z(mS.values()));
    }
    return Z.valueOf(new HashSet<>(mS.values()).size());
  }
}
