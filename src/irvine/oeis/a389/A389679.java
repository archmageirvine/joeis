package irvine.oeis.a389;

import java.util.Arrays;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003056;

/**
 * A388063 Irregular triangle read by rows: T(n,k) is the total number of parts in all partitions of n with k designated summands, n &gt;= 1, 1 &lt;= k &lt;= A003056(n).
 * @author Sean A. Irvine
 */
public class A389679 extends Sequence1 {

  // Cf. A388063

  private final Sequence mRowLength = new A003056().skip();
  private int mM = 0;
  private int mN = 0;
  private Z[] mCount = new Z[0];

  @Override
  public Z next() {
    if (++mM >= mCount.length) {
      final IntegerPartition part = new IntegerPartition(++mN);
      final int t = mCount.length;
      mCount = Arrays.copyOf(mCount, mRowLength.next().intValueExact() + 1); // element 0 not used
      Arrays.fill(mCount, t, mCount.length, Z.ZERO);
      int[] p;
      while ((p = part.next()) != null) {
        int distinctParts = 0;
        Z mult = Z.valueOf(p.length);
        int prev = 0;
        int c = 0;
        for (final int q : p) {
          if (q == prev) {
            ++c;
          } else {
            if (prev != 0) {
              mult = mult.multiply(c);
            }
            ++distinctParts;
            c = 1;
            prev = q;
          }
        }
        mult = mult.multiply(c);
        mCount[distinctParts] = mCount[distinctParts].add(mult);
        mM = 1;
      }
    }
    return mCount[mM];
  }
}

