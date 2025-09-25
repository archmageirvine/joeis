package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080575 Triangle of multinomial coefficients, read by rows (version 2).
 * @author Sean A. Irvine
 */
public class A080575 extends Sequence1 {

  private IntegerPartition mPart = new IntegerPartition(1);
  private int mN = 1;

  @Override
  public Z next() {
    int[] p = mPart.next();
    if (p == null) {
      mPart = new IntegerPartition(++mN);
      p = mPart.next();
    }
    final int[] c = new int[mN + 1];
    IntegerPartition.toCountForm(p, c);
    Z prod = Z.ONE;
    for (int k = 1; k < c.length; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k).pow(c[k]).multiply(Functions.FACTORIAL.z(c[k])));
    }
    return Functions.FACTORIAL.z(mN).divide(prod);
  }
}

