package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.partitions.FixedLengthPartition;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067693 Minimum length of the self-conjugates partitions of n (0 if n=2; length of a partition is the number of parts).
 * @author Sean A. Irvine
 */
public class A067693 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0 || mN == 2) {
      return Z.ZERO;
    }
    int min = 0;
    while (true) {
      final FixedLengthPartition part = new FixedLengthPartition(mN, ++min);
      int[] p;
      while ((p = part.next()) != null) {
        if (Arrays.equals(p, IntegerPartition.dual(p))) {
          return Z.valueOf(min);
        }
      }
    }
  }
}
