package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003513.
 * @author Sean A. Irvine
 */
public class A003513 implements Sequence {

  // After R. J. Mathar

  private HashSet<List<Integer>> mA = new HashSet<>();

  private int add(final List<Integer> s, long chooser) {
    int sum = 0;
    for (final Integer v : s) {
      if (chooser == 0) {
        return sum;  // efficiency
      }
      if ((chooser & 1) == 1) {
        sum += v;
      }
      if (sum < 0) {
        throw new UnsupportedOperationException();
      }
      chooser >>>= 1;
    }
    return sum;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Arrays.asList(1, 1));
    } else {
      final HashSet<List<Integer>> b = new HashSet<>();
      for (final List<Integer> s : mA) {
        final int sa = s.size();
        if (sa > 31) {
          throw new UnsupportedOperationException();
        }
        for (long k = 0; k < 1L << sa; ++k) {
          final int newA = add(s, k);
          if (newA >= s.get(s.size() - 1)) {
            final ArrayList<Integer> newList = new ArrayList<>(s);
            newList.add(newA);
            b.add(newList);
          }
        }
      }
      mA = b;
    }
    return Z.valueOf(mA.size());
  }
}
