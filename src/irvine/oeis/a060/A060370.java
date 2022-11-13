package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a048.A048595;

/**
 * A060370 Ratios (p-1)/d, where p is a prime and d is the number of digits of the periodic part of the decimal expansion of 1/p.
 * @author Sean A. Irvine
 */
public class A060370 extends A000040 {

  private final Sequence mA = new A048595();

  @Override
  public Z next() {
    return super.next().subtract(1).divide(mA.next());
  }
}
