package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036036 Triangle read by rows in which row n lists all the parts of all reversed partitions of n, sorted first by length and then lexicographically.
 * @author Sean A. Irvine
 */
public class A036036 extends Sequence1 {

  private int mN = 0;
  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.COLEXICOGRAPHIC);
  private int[] mCurrent = new int[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      if (mA.isEmpty()) {
        int[] part;
        final IntegerPartition integerPartition = new IntegerPartition(++mN);
        while ((part = integerPartition.next()) != null) {
          mA.add(part);
        }
      }
      mCurrent = mA.pollFirst();
      mM = mCurrent.length - 1;
    }
    return Z.valueOf(mCurrent[mM]);
  }
}

