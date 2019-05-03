package irvine.oeis.a006;

import irvine.math.partitions.IntegerPartition;
import irvine.math.partitions.MurnaghanNakayama;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006907 Number of zeros in character table of symmetric group <code>S_n</code>.
 * @author Sean A. Irvine
 */
public class A006907 implements Sequence {

  private int mN = 0;

  protected boolean accept(final int v) {
    return v == 0;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    int[] lambda;
    int[] mu;
    final IntegerPartition part1 = new IntegerPartition(mN);
    while ((lambda = part1.next()) != null) {
      final IntegerPartition part2 = new IntegerPartition(mN);
      while ((mu = part2.next()) != null) {
        if (accept(MurnaghanNakayama.character(lambda, mu).signum())) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
