package irvine.oeis.a086;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a316.A316566;

/**
 * A086147 Sum of the orders of the elements in the group GL(2,Z_n).
 * @author Sean A. Irvine
 */
public class A086147 extends A316566 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z[] row = computeRow(++mN);
    return Integers.SINGLETON.sum(1, row.length, k -> row[k.intValue() - 1].multiply(k));
  }
}
