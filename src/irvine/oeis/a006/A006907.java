package irvine.oeis.a006;

import irvine.math.partition.IntegerPartition;
import irvine.math.partition.MurnaghanNakayama;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006907 Number of zeros in character table of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A006907 extends Sequence1 {

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
