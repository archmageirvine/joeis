package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007279;

/**
 * A086209 Number of partitions of n-th partition number into partition numbers.
 * @author Sean A. Irvine
 */
public class A086209 extends Sequence0 {

  private final DirectSequence mA = new A007279();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(Functions.PARTITIONS.l(++mN));
  }
}
