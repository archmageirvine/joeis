package irvine.oeis.a395;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395687 Number of partitions of n that can be reduced to a single part by repeatedly replacing two parts x and y with |x - y| &gt;= 3 by their sum x + y.
 * @author Sean A. Irvine
 */
public class A395687 extends Sequence0 {

  private int mN = -1;
  private final HashSet<String> mS = new HashSet<>();

  private void search(final int[] p) {
    if (mS.add(Arrays.toString(p))) {
      for (int k = 0; k < p.length; ++k) {
        for (int j = 1; 2 * j < p[k]; ++j) {
          if (Math.abs(2 * j - p[k]) >= 3) {
            final int[] copy = Arrays.copyOf(p, p.length + 1);
            copy[p.length] = p[k] - j;
            copy[k] = j;
            Arrays.sort(copy);
            search(copy);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 3) {
      return mN == 0 ? Z.ZERO : Z.ONE;
    }
    mS.clear();
    search(new int[] {mN});
    return Z.valueOf(mS.size());
  }
}
