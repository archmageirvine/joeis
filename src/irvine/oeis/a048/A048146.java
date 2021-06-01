package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a034.A034448;

/**
 * A048146 Sum of non-unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A048146 extends A000203 {

  private final Sequence mA = new A034448();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

