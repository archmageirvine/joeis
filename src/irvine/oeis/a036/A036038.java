package irvine.oeis.a036;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036038 Triangle of multinomial coefficients.
 * @author Sean A. Irvine
 */
public class A036038 extends Sequence1 {

  private final TreeSet<int[]> mA = new TreeSet<>(Comparators.ABRAHAM_STEGUN);
  private int mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final IntegerPartition part = new IntegerPartition(++mN);
      int[] p;
      while ((p = part.next()) != null) {
        mA.add(Arrays.copyOf(p, p.length));
      }
    }
    return Binomial.multinomial(mN, mA.pollFirst());
  }
}

