package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a064.A064823;

/**
 * A065253 a(n) = 10*(A064823(n)-1) + A000796(n).
 * @author Sean A. Irvine
 */
public class A065253 extends A000796 {

  private final Sequence mA = new A064823();

  @Override
  public Z next() {
    return mA.next().subtract(1).multiply(10).add(super.next());
  }
}
