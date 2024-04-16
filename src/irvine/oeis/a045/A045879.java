package irvine.oeis.a045;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045879 Numbers whose square contains the same digits as some other square.
 * @author Sean A. Irvine
 */
public class A045879 extends Sequence1 {

  private long mN = 12;
  private Z mLim = Z.valueOf(100);
  private final TreeSet<Long> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final TreeMap<Z, List<Long>> t = new TreeMap<>();
      mLim = mLim.multiply(10);
      Z s;
      while ((s = Z.valueOf(mN).square()).compareTo(mLim) < 0) {
        final Z desc = Functions.DIGIT_SORT_DESCENDING.z(s);
        final List<Long> l = t.get(desc);
        if (l == null) {
          final ArrayList<Long> nl = new ArrayList<>();
          nl.add(mN);
          t.put(desc, nl);
        } else {
          l.add(mN);
        }
        ++mN;
      }
      for (final List<Long> v : t.values()) {
        if (v.size() > 1) {
          mA.addAll(v);
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
