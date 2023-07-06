package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001147;

/**
 * A025549 a(n) = (2n-1)!!/lcm{1,3,5,...,2n-1}.
 * @author Sean A. Irvine
 */
public class A025549 extends A025547 {

  private final Sequence mDF = new A001147().skip(1);

  @Override
  public Z next() {
    return mDF.next().divide(super.next());
  }
}
