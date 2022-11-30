package irvine.oeis.a060;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060555 String together the first n numbers in an order which minimizes the result.
 * @author Sean A. Irvine
 */
public class A060555 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<Long> mA = new ArrayList<>();

  @Override
  public Z next() {
    ++mN;
    String best = A060554.cat(mA, 0, mN);
    int bestPos = 0;
    for (int k = 1; k <= mA.size(); ++k) {
      final String s = A060554.cat(mA, k, mN);
      if (s.compareTo(best) < 0) {
        bestPos = k;
        best = s;
      }
    }
    mA.add(bestPos, mN);
    return new Z(best);
  }
}

