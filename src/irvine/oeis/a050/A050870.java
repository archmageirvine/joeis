package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007318;

/**
 * A050870 T(h,k) = binomial(h,k) - A050186(h,k).
 * @author Sean A. Irvine
 */
public class A050870 extends A007318 {

  private final Sequence mA = new A050186();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
