package irvine.oeis.a051;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051636 Number of "labeled" cyclic subgroups of alternating group A_n.
 * @author Sean A. Irvine
 */
public class A051636 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    Z sum = Z.ZERO;
    int[] p;
    final int[] c = new int[mN + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      int even = 0;
      for (int k = 2; k < c.length; k += 2) {
        even += c[k];
      }
      if ((even & 1) == 0) {
        Z den = Z.ONE;
        Z lcm = Z.ONE;
        for (int k = 1; k < c.length; ++k) {
          if (c[k] > 0) {
            final Z zk = Z.valueOf(k);
            den = den.multiply(mF.factorial(c[k])).multiply(zk.pow(c[k]));
            lcm = lcm.lcm(zk);
          }
        }
        sum = sum.add(mF.factorial(mN).divide(den.multiply(Functions.PHI.z(lcm))));
      }
    }
    return sum;
  }
}
