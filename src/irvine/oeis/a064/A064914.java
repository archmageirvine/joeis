package irvine.oeis.a064;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064914 Number of ordered biquanimous partitions of 2n.
 * @author Sean A. Irvine
 */
public class A064914 extends Sequence0 {

  // There is probably a g.f. for this ...

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final HashSet<String> seen = new HashSet<>();
    final int[] c = new int[2 * mN + 1];
    final IntegerPartition part1 = new IntegerPartition(mN);
    int[] p1;
    while ((p1 = part1.next()) != null) {
      final IntegerPartition part2 = new IntegerPartition(mN);
      int[] p2;
      do {
        p2 = part2.next();
        IntegerPartition.toCountForm(IntegerPartition.merge(p1, p2), c);
        if (seen.add(Arrays.toString(c))) {
          sum = sum.add(Binomial.multinomial(p1.length + p2.length, c));
        }
      } while (!Arrays.equals(p1, p2));
    }
    return sum;
  }
}

