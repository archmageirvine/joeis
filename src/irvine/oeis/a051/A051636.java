package irvine.oeis.a051;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051636 Number of "labeled" cyclic subgroups of alternating group A_n.
 * @author Sean A. Irvine
 */
public class A051636 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    Z sum = Z.ZERO;
    int[] p;
    int[] c = new int[mN + 1];
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
        sum = sum.add(mF.factorial(mN).divide(den.multiply(Euler.phi(lcm))));
      }
    }
    return sum;
  }
}
