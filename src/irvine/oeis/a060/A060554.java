package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060554 String together the first n numbers in an order which maximizes the result.
 * @author Sean A. Irvine
 */
public class A060554 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<Long> mA = new ArrayList<>();

  static String cat(final List<Long> lst, final int pos, final long u) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < lst.size(); ++k) {
      if (pos == k) {
        sb.append(u);
      }
      sb.append(lst.get(k));
    }
    if (pos == lst.size()) {
      sb.append(u);
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    ++mN;
    String best = cat(mA, 0, mN);
    int bestPos = 0;
    for (int k = 1; k <= mA.size(); ++k) {
      final String s = cat(mA, k, mN);
      if (s.compareTo(best) > 0) {
        bestPos = k;
        best = s;
      }
    }
    mA.add(bestPos, mN);
    return new Z(best);
  }
}

