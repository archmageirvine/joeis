package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a088.A088643;

/**
 * A049476 Numbers that set records for initial gap lengths g in the permutations found in A088643.
 * @author Sean A. Irvine
 */
public class A049476 extends A088643 {

  private int mN = 0;
  private long mMaxGap = -1;

  private int[] getRow(final int n) {
    final int[] res = new int[n];
    for (int k = 0; k < n; ++k) {
      res[k] = super.next().intValueExact();
    }
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] row = getRow(++mN);
      //System.out.println(mN + " Breaks at : " + getBreak(row));
      if (row.length <= 1) {
        return Z.ONE;
      }
      final TreeSet<Integer> seen = new TreeSet<>();
      seen.add(row[0]); // always n
      int g = 1;
      int firstMissing = mN - g;
      while (true) {
        seen.add(row[g]);
        while (seen.contains(firstMissing)) {
          --firstMissing;
        }
        //System.out.println("In loop: n=" + mN + " miss=" + firstMissing + " g=" + g + " " + seen.size() + " " + seen);
        if (firstMissing == mN - seen.size() && (seen.size() == mN || row[g + 1] == mN - g - 1)) {
          // todo done
         // System.out.println(mN + " " + seen.size() + " " + firstMissing + " next: " + row[Math.min(g + 1, row.length - 1)]);
          System.out.println(mN + " " + g);
          if (g > mMaxGap) {
            mMaxGap = seen.size();
            return Z.valueOf(mN);
          }
          break;
        }
        ++g;
      }
    }
  }
}
