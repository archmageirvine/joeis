package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390121 allocated for Geoffrey Critzer.
 * @author Sean A. Irvine
 */
public class A390121 extends Sequence0 {

  private int mN = 0;
  private IntegerPartition mPart = new IntegerPartition(0);

  @Override
  public Z next() {
    int[] p = mPart.next();
    if (p == null) {
      mPart = new IntegerPartition(++mN);
      p = mPart.next();
    }
    final int[] c = new int[mN + 1];
    IntegerPartition.toCountForm(p, c);
    final Z num = Functions.FACTORIAL.z(mN).pow(3);
    Z den = Z.ONE;
    int d = 0;
    for (int i = 1; i < c.length; i++) {
      final int ki = c[i];
      if (ki != 0) {
        d += ki;
        den = den.multiply(Functions.FACTORIAL.z(i).pow(2L * ki)).multiply(Functions.FACTORIAL.z(ki));
      }
    }
    den = den.multiply(Functions.FACTORIAL.z(mN - d));
    return num.divide(den);
  }
}
