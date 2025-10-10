package irvine.oeis.a389;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389399 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A389399 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if ((Functions.SYNDROME.i(++mN) & 0b0101010101) == 0) {
      return Z.ONE; // i.e., number comprised on of 1,3,5,7,9 digits
    }
    final Set<Long> set = new HashSet<>();
    final TreeSet<Long> next = new TreeSet<>();
    set.add(mN);
    next.add(mN);
    while (!next.isEmpty()) {
      final String s = String.valueOf(next.pollLast());
      for (int k = s.length() - 1; k >= 0; --k) {
        if ((s.charAt(k) & 1) == 0) {
          for (int j = k; j >= 0; --j) {
            if (s.charAt(j) != 0) {
              final long v = Long.parseLong(s.substring(0, j) + Long.parseLong(s.substring(j, k + 1)) / 2 + s.substring(k + 1));
              if (set.add(v)) {
                next.add(v);
              }
            }
          }
        }
      }
    }
    return Z.valueOf(set.size());
  }
}
