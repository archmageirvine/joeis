package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060180 Sum of distinct orders of degree-n even permutations.
 * @author Sean A. Irvine
 */
public class A060180 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    final int[] c = new int[mN + 1];
    final HashSet<Z> seen = new HashSet<>();
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      if (IntegerPartition.isEven(c)) {
        seen.add(Functions.LCM.z(p));
      }
    }
    return Functions.SUM.z(seen);
  }
}
