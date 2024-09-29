package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056646 a(n) = A056622(A001405(n)).
 * @author Sean A. Irvine
 */
public class A056646 extends A056056 {

  private final Sequence mA = new A056059();

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
