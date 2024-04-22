package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a059.A059867;

/**
 * A060368 Number of irreducible representations of the symmetric group S_n that have even degree.
 * @author Sean A. Irvine
 */
public class A060368 extends A059867 {

  private int mN = 0;

  @Override
  public Z next() {
    final int index = ++mN;
    return Functions.PARTITIONS.z(index).subtract(super.next());
  }
}
