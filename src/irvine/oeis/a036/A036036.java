package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036036 Triangle read by rows in which row n lists all the parts of all reversed partitions of n, sorted first by length and then lexicographically.
 * @author Sean A. Irvine
 */
public class A036036 implements Sequence {

  private int mN = 0;
  private final TreeSet<int[]> mA = new TreeSet<>((a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = a.length - 1; k >= 0; --k) {
      final int ck = Integer.compare(a[k], b[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  });
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

